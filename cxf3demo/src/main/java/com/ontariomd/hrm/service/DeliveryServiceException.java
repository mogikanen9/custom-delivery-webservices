package com.ontariomd.hrm.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebFault;

import com.ontariomd.hrm.service.bean.delivery.DeliveryServiceFaultInfo;

@WebFault(name = "DeliveryServiceException", targetNamespace = "http://schemas.ontariomd.com/hrm/delivery")
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
