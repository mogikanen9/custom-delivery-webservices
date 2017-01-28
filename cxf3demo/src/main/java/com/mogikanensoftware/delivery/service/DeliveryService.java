package com.mogikanensoftware.delivery.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.BindingType;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;

import com.mogikanensoftware.delivery.service.bean.delivery.DownloadMessageRequest;
import com.mogikanensoftware.delivery.service.bean.delivery.DownloadMessageResponse;
import com.mogikanensoftware.delivery.service.bean.delivery.GetNewMessagesRequest;
import com.mogikanensoftware.delivery.service.bean.delivery.GetNewMessagesResponse;
import com.mogikanensoftware.delivery.service.bean.delivery.UpdateMessageStatusRequest;
import com.mogikanensoftware.delivery.service.bean.delivery.UpdateMessageStatusResponse;

@WebService(targetNamespace = "http://schemas.mogikanensoftware.com/delivery")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@SchemaValidation(type = SchemaValidationType.BOTH)
public interface DeliveryService {

	@WebMethod(operationName = "getNewMessages", action="getNewMessages")
	@WebResult(name="getNewMessagesResponse", targetNamespace="http://schemas.mogikanensoftware.com/delivery/type")
	GetNewMessagesResponse getNewMessages(
			@WebParam(name = "getNewMessagesRequest", targetNamespace="http://schemas.mogikanensoftware.com/delivery/type", mode = Mode.IN) GetNewMessagesRequest request) throws DeliveryServiceException;

	@WebMethod(operationName = "updateMessageStatus", action="updateMessageStatus")
	@WebResult(name="updateMessageStatusResponse", targetNamespace="http://schemas.mogikanensoftware.com/delivery/type")
	UpdateMessageStatusResponse updateMessageStatus(
			@WebParam(name = "updateMessageStatusRequest", targetNamespace="http://schemas.mogikanensoftware.com/delivery/type", mode = Mode.IN) UpdateMessageStatusRequest request) throws DeliveryServiceException;

	@WebMethod(operationName = "downloadMessage", action="downloadMessage")
	@WebResult(name="downloadMessageResponse", targetNamespace="http://schemas.mogikanensoftware.com/delivery/type")
	DownloadMessageResponse downloadMessage(
			@WebParam(name = "downloadMessageRequest", targetNamespace="http://schemas.mogikanensoftware.com/delivery/type", mode = Mode.IN) DownloadMessageRequest request) throws DeliveryServiceException;
}
