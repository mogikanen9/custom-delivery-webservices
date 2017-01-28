package com.mogikanensoftware.delivery.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebFault;

import com.mogikanensoftware.delivery.service.bean.delivery.DeliveryServiceFaultInfo;

@WebFault(name = "DeliveryServiceException", targetNamespace = "http://schemas.mogikanensoftware.com/delivery/type")
public class DeliveryServiceException extends Exception{

	private static final long serialVersionUID = 1L;

	@XmlElement(name="fault",required=true)
	private DeliveryServiceFaultInfo fault;
	
	public DeliveryServiceFaultInfo getFault() {
		return fault;
	}

	public void setFault(DeliveryServiceFaultInfo fault) {
		this.fault = fault;
	}	

}
