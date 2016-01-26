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

import com.ontariomd.hrm.service.bean.delivery.DeclineMessagesRequest;
import com.ontariomd.hrm.service.bean.delivery.DeclineMessagesResponse;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageRequest;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageResponse;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesRequest;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesResponse;

@WebService(targetNamespace = "http://schemas.ontariomd.com/hrm/delivery")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DeliveryService {

	@WebMethod(operationName = "getNewMessages", action="getNewMessages")
	@WebResult(name="getNewMessagesResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	GetNewMessagesResponse getNewMessages(
			@WebParam(name = "getNewMessagesRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) GetNewMessagesRequest request) throws DeliveryServiceException;

	@WebMethod(operationName = "declineMessages", action="declineMessages")
	@WebResult(name="declineMessagesResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	DeclineMessagesResponse declineMessages(
			@WebParam(name = "declineMessagesRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) DeclineMessagesRequest request) throws DeliveryServiceException;

	@WebMethod(operationName = "downloadMessage", action="downloadMessage")
	@WebResult(name="downloadMessageResponse", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type")
	DownloadMessageResponse downloadMessage(
			@WebParam(name = "downloadMessageRequest", targetNamespace="http://schemas.ontariomd.com/hrm/delivery/type", mode = Mode.IN) DownloadMessageRequest request) throws DeliveryServiceException;
}
