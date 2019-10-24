package com.hcl.Json;

import java.util.HashMap;
import java.util.Map;

public class JsonExample2 {
	public static void main(String[] args) {
		
		Map ob = new HashMap();
		ob.put("age", new Integer(22));
		ob.put("salary", new Double(45421.36));
		ob.put("name", "Jerry");
		System.out.println(ob);
	
	}
}
