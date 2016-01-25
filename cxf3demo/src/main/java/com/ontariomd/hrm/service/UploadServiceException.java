package com.ontariomd.hrm.service;

import javax.xml.ws.WebFault;

import com.ontariomd.hrm.service.bean.upload.UploadServiceFault;

@WebFault(name = "DeliveryServiceException", targetNamespace = "http://schemas.ontariomd.com/hrm/UploadService")
public class UploadServiceException extends Exception{

	private static final long serialVersionUID = 1L;

	private UploadServiceFault fault;

	public UploadServiceFault getFault() {
		return fault;
	}

	public void setFault(UploadServiceFault fault) {
		this.fault = fault;
	}
}
