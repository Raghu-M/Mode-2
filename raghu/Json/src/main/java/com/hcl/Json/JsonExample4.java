package com.hcl.Json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonExample4 {
	
	public static void main(String[] args) {
		String s = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";  
		JSONObject j = (JSONObject) JSONValue.parse(s);
		
		System.out.println(j.get("name"));
		System.out.println(j.get("salary"));
		System.out.println(j.get("age"));
	}

}
