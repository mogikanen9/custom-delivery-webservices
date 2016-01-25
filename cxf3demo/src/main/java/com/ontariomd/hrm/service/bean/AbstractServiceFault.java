package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class AbstractServiceFault extends AbstractBean{

	private static final long serialVersionUID = 1L;

	private String faultString;
	private String faultCode;
	
	public String getFaultString() {
		return faultString;
	}
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	public String getFaultCode() {
		return faultCode;
	}
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

}
