package com.hcl.webService;

import java.rmi.RemoteException;

public class MainApplivation {
	public static void main(String[] args) {
		CalculatorProxy cP = new CalculatorProxy();
		try{
			
			System.out.println(cP.mul(2, 11));
			System.out.println(cP.add(4, 11));
			System.out.println(cP.display());
		} catch(RemoteException e){
			e.printStackTrace();
		}
	}

}
