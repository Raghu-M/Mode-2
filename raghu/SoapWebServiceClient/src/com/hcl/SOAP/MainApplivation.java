package com.hcl.SOAP;

import java.rmi.RemoteException;

public class MainApplivation {
	public static void main(String[] args) {
		CalculatorProxy cP = new CalculatorProxy();
		com.hcl.webService.CalculatorProxy ad = new com.hcl.webService.CalculatorProxy();
		try{
			
			int a = cP.getPrem();
			int b = 5;
			System.out.println(ad.add(a, b));
		} catch(RemoteException e){
			e.printStackTrace();
		}
	}

}
