/**
 * WSAnnotationsWebResultImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javacodegeeks.examples.jaxWsAnnotations.webresult;

public class WSAnnotationsWebResultImplServiceLocator extends org.apache.axis.client.Service implements com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultImplService {

    public WSAnnotationsWebResultImplServiceLocator() {
    }


    public WSAnnotationsWebResultImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSAnnotationsWebResultImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSAnnotationsWebResultImplPort
    private java.lang.String WSAnnotationsWebResultImplPort_address = "http://127.0.0.1:9999/ctf";

    public java.lang.String getWSAnnotationsWebResultImplPortAddress() {
        return WSAnnotationsWebResultImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSAnnotationsWebResultImplPortWSDDServiceName = "WSAnnotationsWebResultImplPort";

    public java.lang.String getWSAnnotationsWebResultImplPortWSDDServiceName() {
        return WSAnnotationsWebResultImplPortWSDDServiceName;
    }

    public void setWSAnnotationsWebResultImplPortWSDDServiceName(java.lang.String name) {
        WSAnnotationsWebResultImplPortWSDDServiceName = name;
    }

    public com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI getWSAnnotationsWebResultImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSAnnotationsWebResultImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSAnnotationsWebResultImplPort(endpoint);
    }

    public com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI getWSAnnotationsWebResultImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultImplPortBindingStub _stub = new com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWSAnnotationsWebResultImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSAnnotationsWebResultImplPortEndpointAddress(java.lang.String address) {
        WSAnnotationsWebResultImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultImplPortBindingStub _stub = new com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultImplPortBindingStub(new java.net.URL(WSAnnotationsWebResultImplPort_address), this);
                _stub.setPortName(getWSAnnotationsWebResultImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSAnnotationsWebResultImplPort".equals(inputPortName)) {
            return getWSAnnotationsWebResultImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webresult.jaxWsAnnotations.examples.javacodegeeks.com/", "WSAnnotationsWebResultImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webresult.jaxWsAnnotations.examples.javacodegeeks.com/", "WSAnnotationsWebResultImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSAnnotationsWebResultImplPort".equals(portName)) {
            setWSAnnotationsWebResultImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
