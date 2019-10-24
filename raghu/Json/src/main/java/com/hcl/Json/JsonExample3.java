package com.hcl.Json;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonExample3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		JSONObject ob = new JSONObject();
		for(int i=0;i<3;i++){
		JSONArray arr = new JSONArray();
		arr.add(s.next());
		arr.add(s.nextInt());
		arr.add(s.next());
		
		ob.put(i, arr);
		}
		System.out.println(ob);
	}

}
