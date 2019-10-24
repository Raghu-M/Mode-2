package com.hcl.fault;

import javax.xml.ws.Endpoint;

public class Publisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://192.168.1.21:8089/HelloWorld", new HelloWorld());
	}

}
