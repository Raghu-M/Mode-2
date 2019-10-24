package com.javacodegeeks.examples.jaxWsAnnotations.webresult;

public class WSAnnotationsWebResultIProxy implements com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI {
  private String _endpoint = null;
  private com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI wSAnnotationsWebResultI = null;
  
  public WSAnnotationsWebResultIProxy() {
    _initWSAnnotationsWebResultIProxy();
  }
  
  public WSAnnotationsWebResultIProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAnnotationsWebResultIProxy();
  }
  
  private void _initWSAnnotationsWebResultIProxy() {
    try {
      wSAnnotationsWebResultI = (new com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultImplServiceLocator()).getWSAnnotationsWebResultImplPort();
      if (wSAnnotationsWebResultI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAnnotationsWebResultI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAnnotationsWebResultI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAnnotationsWebResultI != null)
      ((javax.xml.rpc.Stub)wSAnnotationsWebResultI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI getWSAnnotationsWebResultI() {
    if (wSAnnotationsWebResultI == null)
      _initWSAnnotationsWebResultIProxy();
    return wSAnnotationsWebResultI;
  }
  
  public float celsiusToFarhenheit(float arg0) throws java.rmi.RemoteException{
    if (wSAnnotationsWebResultI == null)
      _initWSAnnotationsWebResultIProxy();
    return wSAnnotationsWebResultI.celsiusToFarhenheit(arg0);
  }
  
  
}