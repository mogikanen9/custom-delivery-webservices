package com.ontariomd.hrm.service.impl;

import javax.jws.WebService;

import com.ontariomd.hrm.service.DeliveryService;
import com.ontariomd.hrm.service.DeliveryServiceException;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageRequest;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageResponse;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesMessageInfo;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesRecipientInfo;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesRequest;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesResponse;
import com.ontariomd.hrm.service.bean.delivery.RecipientIdentityType;
import com.ontariomd.hrm.service.bean.delivery.UpdateMessageStatusRequest;
import com.ontariomd.hrm.service.bean.delivery.UpdateMessageStatusResponse;

@WebService(endpointInterface = "com.ontariomd.hrm.service.DeliveryService", portName = "DeliveryServicePort", serviceName="DeliveryService", targetNamespace = "http://schemas.ontariomd.com/hrm/delivery")
public class DeliveryServiceImpl implements DeliveryService {

	public GetNewMessagesResponse getNewMessages(GetNewMessagesRequest request) {
		
		System.out.println("GetNewMessagesResponse...");
		
		GetNewMessagesResponse response = new GetNewMessagesResponse();

		GetNewMessagesMessageInfo[] msgInfo = new GetNewMessagesMessageInfo[10];

		for (int i = 0; i < msgInfo.length; i++) {
			msgInfo[i] = new GetNewMessagesMessageInfo();
			msgInfo[i].setMessageDeliveryUid("UID" + i);
			
			GetNewMessagesRecipientInfo recipient = new GetNewMessagesRecipientInfo();
			recipient.setIdentityType(RecipientIdentityType.CNO);
			recipient.setIdentityValue("23432345");
			
			msgInfo[i].setRecipients(new GetNewMessagesRecipientInfo[]{recipient});
			
		}

		response.setMessages(msgInfo);

		return response;
	}

	public DownloadMessageResponse downloadMessage(DownloadMessageRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public UpdateMessageStatusResponse updateMessageStatus(UpdateMessageStatusRequest request)
			throws DeliveryServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
