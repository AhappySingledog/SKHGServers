
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.ecity.skhg.rest;

/**
 * This class was generated by Apache CXF 2.2.10
 * Fri Aug 02 09:23:11 CST 2013
 * Generated source version: 2.2.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "NBPortAqServer",
                      portName = "NBPortAqServerPort",
                      targetNamespace = "http://www.ecitychina.com/NBPortAqService/10.0",
                      endpointInterface = "com.ecity.aq.rest.NBPortAqServerSoap")
                      
public class SKHGStageServerSoapImpl implements SKHGStageServerSoap {
	
    private ServiceCore CORE;
    
    public ServiceCore getCORE()
    {
      return this.CORE;
    }
  
    public void setCORE(ServiceCore CORE) {
      this.CORE = CORE;
    }
}
