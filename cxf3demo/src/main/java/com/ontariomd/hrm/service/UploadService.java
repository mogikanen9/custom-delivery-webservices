package com.ontariomd.hrm.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.BindingType;

import com.ontariomd.hrm.service.bean.upload.UploadMessageRequest;
import com.ontariomd.hrm.service.bean.upload.UploadMessageResponse;

@WebService(targetNamespace = "http://schemas.ontariomd.com/hrm/UploadService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface UploadService {

	@WebMethod(operationName = "uploadMessage")
	UploadMessageResponse uploadMessage(@WebParam(name = "uploadMessageRequest", mode = Mode.IN) UploadMessageRequest request) throws UploadServiceException;
}
