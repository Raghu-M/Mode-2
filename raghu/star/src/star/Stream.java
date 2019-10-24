package star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Raghu");
		name.add("Prem Reddy");
		name.add("Vinod");
		System.out.println(name);
		
		ArrayList<String> name1 = (ArrayList<String>) name.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		
		System.out.println(name1);
		
		List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println(a);
		
		long b = a.stream().filter(k -> k>5).count();
		System.out.println(b);
	}

}
