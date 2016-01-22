package com.ontariomd.hrm.service;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.ontariomd.hrm.service.bean.DeclineMessagesRequest;
import com.ontariomd.hrm.service.bean.DeclineMessagesResponse;
import com.ontariomd.hrm.service.bean.DownloadMessageRequest;
import com.ontariomd.hrm.service.bean.GetNewMessagesRequest;
import com.ontariomd.hrm.service.bean.GetNewMessagesResponse;

@WebService(name = "deliveryService", targetNamespace = "http://hrm.ontariomd.com")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface DeliveryService {

	@WebMethod(operationName = "getNewMessages")
	GetNewMessagesResponse getNewMessages(
			@WebParam(name = "getNewMessagesRequest", mode = Mode.IN) GetNewMessagesRequest request);

	@WebMethod(operationName = "declineMessages")
	DeclineMessagesResponse declineMessages(
			@WebParam(name = "declineMessagesRequest", mode = Mode.IN)
			DeclineMessagesRequest request);
	
	@WebMethod(operationName = "downloadMessage")
	DataHandler downloadMessage(@WebParam(name = "downloadMessageRequest", mode = Mode.IN) DownloadMessageRequest request);
}
