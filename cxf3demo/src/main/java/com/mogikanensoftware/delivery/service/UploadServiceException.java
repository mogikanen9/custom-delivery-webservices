package com.mogikanensoftware.delivery.service;

import javax.xml.ws.WebFault;

import com.mogikanensoftware.delivery.service.bean.upload.UploadServiceFault;

@WebFault(name = "UploadServiceException", targetNamespace = "http://schemas.mogikanensoftware.com/upload/type")
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
