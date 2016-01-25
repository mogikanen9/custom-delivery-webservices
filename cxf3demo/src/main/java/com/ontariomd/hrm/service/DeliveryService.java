package com.ontariomd.hrm.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.BindingType;

import com.ontariomd.hrm.service.bean.DeclineMessagesRequest;
import com.ontariomd.hrm.service.bean.DeclineMessagesResponse;
import com.ontariomd.hrm.service.bean.DownloadMessageRequest;
import com.ontariomd.hrm.service.bean.DownloadMessageResponse;
import com.ontariomd.hrm.service.bean.GetNewMessagesRequest;
import com.ontariomd.hrm.service.bean.GetNewMessagesResponse;

@WebService(targetNamespace = "http://schemas.ontariomd.com/hrm/DeliveryService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DeliveryService {

	@WebMethod(operationName = "getNewMessages")
	GetNewMessagesResponse getNewMessages(
			@WebParam(name = "getNewMessagesRequest", mode = Mode.IN) GetNewMessagesRequest request);

	@WebMethod(operationName = "declineMessages")
	DeclineMessagesResponse declineMessages(
			@WebParam(name = "declineMessagesRequest", mode = Mode.IN) DeclineMessagesRequest request);

	@WebMethod(operationName = "downloadMessage")
	DownloadMessageResponse downloadMessage(
			@WebParam(name = "downloadMessageRequest", mode = Mode.IN) DownloadMessageRequest request);
}
