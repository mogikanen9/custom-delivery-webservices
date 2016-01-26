package com.ontariomd.hrm.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.BindingType;

import com.ontariomd.hrm.service.bean.upload.UploadMessageRequest;
import com.ontariomd.hrm.service.bean.upload.UploadMessageResponse;

@WebService(targetNamespace = "http://schemas.ontariomd.com/hrm/upload")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface UploadService {

	@WebMethod(operationName = "uploadMessage")
	@WebResult(name="uploadMessageResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	UploadMessageResponse uploadMessage(@WebParam(name = "uploadMessageRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) UploadMessageRequest request) throws UploadServiceException;
}
