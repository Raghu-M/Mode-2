package com.hcl.Json;

import org.json.simple.JSONObject;

public class JsonExample {
	public static void main(String[] args) {
		JSONObject ob = new JSONObject();
		
		ob.put("age", new Integer(22));
		ob.put("salary", new Double(45421.36));
		ob.put("name", "Jerry");
		System.out.println(ob);
		
	}

}
