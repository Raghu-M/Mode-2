package com.hcl.SOAP;

public class CalculatorProxy implements com.hcl.SOAP.Calculator {
  private String _endpoint = null;
  private com.hcl.SOAP.Calculator calculator = null;
  
  public CalculatorProxy() {
    _initCalculatorProxy();
  }
  
  public CalculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorProxy();
  }
  
  private void _initCalculatorProxy() {
    try {
      calculator = (new com.hcl.SOAP.CalculatorServiceLocator()).getCalculator();
      if (calculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculator != null)
      ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hcl.SOAP.Calculator getCalculator() {
    if (calculator == null)
      _initCalculatorProxy();
    return calculator;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.add(a, b);
  }
  
  public int mul(int a, int b) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.mul(a, b);
  }
  
  public java.lang.String display() throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.display();
  }
  
  public int getPrem() throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.getPrem();
  }
  
  
}