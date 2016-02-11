package com.ontariomd.hrm.service;

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

import com.ontariomd.hrm.service.bean.delivery.UpdateMessageStatusRequest;
import com.ontariomd.hrm.service.bean.delivery.UpdateMessageStatusResponse;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageRequest;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageResponse;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesRequest;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesResponse;

@WebService(targetNamespace = "http://schemas.ontariomd.com/hrm/delivery")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@SchemaValidation(type = SchemaValidationType.BOTH)
public interface DeliveryService {

	@WebMethod(operationName = "getNewMessages", action="getNewMessages")
	@WebResult(name="getNewMessagesResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	GetNewMessagesResponse getNewMessages(
			@WebParam(name = "getNewMessagesRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) GetNewMessagesRequest request) throws DeliveryServiceException;

	@WebMethod(operationName = "updateMessageStatus", action="updateMessageStatus")
	@WebResult(name="updateMessageStatusResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	UpdateMessageStatusResponse updateMessageStatus(
			@WebParam(name = "updateMessageStatusRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) UpdateMessageStatusRequest request) throws DeliveryServiceException;

	@WebMethod(operationName = "downloadMessage", action="downloadMessage")
	@WebResult(name="downloadMessageResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	DownloadMessageResponse downloadMessage(
			@WebParam(name = "downloadMessageRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) DownloadMessageRequest request) throws DeliveryServiceException;
}
