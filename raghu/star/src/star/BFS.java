package star;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
		static int[][] maze = {
            {  0,100,  0,  0,  0,  0,  0,  0},
            {  0,100,  0,  0,  0,  0,  0,  0},
            {  0,100,  0,100,100,100,  0,  0},
            {  0,100,  0,  0,  0,100,  0,100},
            {  0,100,100,  0,  0,100,  0,  0},
            {  0,100,100,  0,100,100,  0,  0},
            {  0,  0,  0,  0,100,100,100,  0},
            {  0,  0,100,100,100,  1,  0,  0},
        };
		
		static int shortpath[][] = {
				{000,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				{100,100,100,100,100,100,100,100},
				
		};
	 static Queue<Integer> rq = new LinkedList<>();
	 static Queue<Integer> cq = new LinkedList<>();
	 static boolean visited[][] =  new boolean[8][8];
	 static int r,c;
	static boolean reached_end;
	public static void main(String[] args) {
		int sr=0;
		int sc=0;
		rq.add(sr);
		cq.add(sc);
		visited[sr][sc] = true;
		while (rq.size()>0){
			r = rq.remove();
			c = cq.remove();
			 if(maze[r][c]==1){
				 reached_end = true;
				 break;
			 }
			 explore(r,c);
		}
		if(reached_end == true)System.out.println("path found cost = "+shortpath[r][c]);
		else System.out.println("path not found");
		
		int retrace[][] = trace(r,c);
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(retrace[i][j] == 1)System.out.print("#");
				else if(visited[i][j] == true){
					System.out.print("*");
				}
				else if(visited[i][j] == false){
					System.out.print("0");
				}
			}System.out.print("\n");
		}
		
		
		System.out.println("\n\n\n");
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(shortpath[i][j]+"\t");
			}System.out.print("\n");
		}
	}
	
	
	public static void explore(int r, int c){
		int dr[] = {0,1,0,-1};
		int dc[] = {1,0,-1,0};
		int sr,sc;
		for(int i=0;i<4;i++){
			sr = r+dr[i];
			sc = c+dc[i];
			if(sr<0 || sc<0 || sc>7 || sr>7)continue;
			if(visited[sr][sc] == true || maze[sr][sc]== 100)continue;
			visited[sr][sc] = true;
			rq.add(sr);
			cq.add(sc);
			if(shortpath[sr][sc] > shortpath[r][c]+1 ){
				shortpath[sr][sc] = shortpath[r][c]+1;
				
			}
		}
	}
	
	public static int[][] trace(int r,int c){
		int retace[][] = new int[8][8];
		int dr[] = {-1,0,1,0};
		int dc[] = {0,-1,0,1};
		retace[r][c] = 1;
		int sr,sc;
		while(r!=0 ||c!=0){
			for(int i=0;i<4;i++){
				sr = r+dr[i];
				sc = c+dc[i];
				if(sr<0 || sc<0 || sc>7 || sr>7)continue;
				if(shortpath[sr][sc]<shortpath[r][c]){
					retace[sr][sc]=1;
					r=sr;
					c=sc;
					break;
				}
				
	
			} 
		}retace[r][c]=1;
		return retace;		
	}

}
