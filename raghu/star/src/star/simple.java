package star;

import java.util.ArrayList;
import java.util.List;

interface display{
	String display();
}


@FunctionalInterface
interface Icalc{
	int calc(int a,int b);
}

@FunctionalInterface
interface Grade{
	String calc(int a);
}

public class simple {
	public static void main(String[] args) {
		Icalc max = (a,b) -> {int c = a>b?a:b; return c;};
		Icalc add = (a,b) -> (a+b);
		display show = () -> ("Say Hello...");
		System.out.println(max.calc(3,9));
		System.out.println(show.display());
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("jerry");
		list.add("how");
		list.add("are");
		list.add("you");
		list.forEach( i -> System.out.println(i));
		//list.forEach(System.out :: println); // same as previous line
		
		
		Grade obj = (a) -> { if(a>=76)return "Distinction" ;
								else if(a>=61)return "First Class" ;
								else if(a>=41)return "Average" ;
								return "Fail";};
								
		System.out.println(obj.calc(76));
	}
	

}
