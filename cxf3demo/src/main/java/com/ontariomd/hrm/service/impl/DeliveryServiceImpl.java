package com.ontariomd.hrm.service.impl;

import javax.activation.DataHandler;
import javax.jws.WebService;

import com.ontariomd.hrm.service.DeliveryService;
import com.ontariomd.hrm.service.bean.*;

@WebService(endpointInterface = "com.ontariomd.hrm.service.DeliveryService", targetNamespace = "http://hrm.ontariomd.com", portName = "DeliveryServicePort", serviceName = "DeliveryService")
public class DeliveryServiceImpl implements DeliveryService {	
	
	
	public GetNewMessagesResponse getNewMessages(GetNewMessagesRequest request) {
		GetNewMessagesResponse response = new GetNewMessagesResponse();
		
		GetNewMessagesMessageInfo[] msgInfo = new GetNewMessagesMessageInfo[10];
		
		for(int i=0;i<msgInfo.length;i++){
			msgInfo[i] = new GetNewMessagesMessageInfo();
			msgInfo[i].setMessageUid("UID"+i);
		}
		
		response.setMessages(msgInfo);
		
		return response;
	}

	public DeclineMessagesResponse declineMessages(
			DeclineMessagesRequest request) {
		DeclineMessagesResponse response = new DeclineMessagesResponse();
		
		if(request.getMessages()!=null){
			for (DeclineMessagesMessageInfo message: request.getMessages()) {
				//do smth
			}
		}
		
		return response;
	}



	public DataHandler downloadMessage(DownloadMessageRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
