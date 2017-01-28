package com.mogikanensoftware.delivery.service;

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

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;

import com.mogikanensoftware.delivery.service.bean.upload.UploadMessageRequest;
import com.mogikanensoftware.delivery.service.bean.upload.UploadMessageResponse;

@WebService(targetNamespace = "http://schemas.mogikanensoftware.com/upload")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_MTOM_BINDING)
@SchemaValidation(type = SchemaValidationType.BOTH)
public interface UploadService {

	@WebMethod(operationName = "uploadMessage")
	@WebResult(name="uploadMessageResponse", targetNamespace="http://schemas.mogikanensoftware.com/upload/type")
	UploadMessageResponse uploadMessage(@WebParam(name = "uploadMessageRequest", targetNamespace="http://schemas.mogikanensoftware.com/upload/type", mode = Mode.IN) UploadMessageRequest request) throws UploadServiceException;
}
