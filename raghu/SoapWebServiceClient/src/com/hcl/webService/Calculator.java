/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hcl.webService;

public interface Calculator extends java.rmi.Remote {
    public int add(int a, int b) throws java.rmi.RemoteException;
    public int mul(int a, int b) throws java.rmi.RemoteException;
    public java.lang.String display() throws java.rmi.RemoteException;
}
