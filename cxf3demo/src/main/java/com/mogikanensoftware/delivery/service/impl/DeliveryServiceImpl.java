package com.mogikanensoftware.delivery.service.impl;

import javax.jws.WebService;

import com.mogikanensoftware.delivery.service.DeliveryService;
import com.mogikanensoftware.delivery.service.DeliveryServiceException;
import com.mogikanensoftware.delivery.service.bean.delivery.DownloadMessageRequest;
import com.mogikanensoftware.delivery.service.bean.delivery.DownloadMessageResponse;
import com.mogikanensoftware.delivery.service.bean.delivery.GetNewMessagesMessageInfo;
import com.mogikanensoftware.delivery.service.bean.delivery.GetNewMessagesRecipientInfo;
import com.mogikanensoftware.delivery.service.bean.delivery.GetNewMessagesRequest;
import com.mogikanensoftware.delivery.service.bean.delivery.GetNewMessagesResponse;
import com.mogikanensoftware.delivery.service.bean.delivery.RecipientIdentityType;
import com.mogikanensoftware.delivery.service.bean.delivery.UpdateMessageStatusRequest;
import com.mogikanensoftware.delivery.service.bean.delivery.UpdateMessageStatusResponse;

@WebService(endpointInterface = "com.mogikanensoftware.delivery.service.DeliveryService", portName = "DeliveryServicePort", serviceName="DeliveryService", targetNamespace = "http://schemas.mogikanensoftware.com/delivery")
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
