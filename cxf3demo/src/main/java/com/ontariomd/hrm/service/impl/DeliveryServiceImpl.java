package com.ontariomd.hrm.service.impl;

import javax.jws.WebService;

import com.ontariomd.hrm.service.DeliveryService;
import com.ontariomd.hrm.service.bean.delivery.DeclineMessagesMessageInfo;
import com.ontariomd.hrm.service.bean.delivery.DeclineMessagesRequest;
import com.ontariomd.hrm.service.bean.delivery.DeclineMessagesResponse;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageRequest;
import com.ontariomd.hrm.service.bean.delivery.DownloadMessageResponse;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesMessageInfo;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesRequest;
import com.ontariomd.hrm.service.bean.delivery.GetNewMessagesResponse;

@WebService(endpointInterface = "com.ontariomd.hrm.service.DeliveryService", portName = "DeliveryServicePort", serviceName = "DeliveryService")
public class DeliveryServiceImpl implements DeliveryService {

	public GetNewMessagesResponse getNewMessages(GetNewMessagesRequest request) {
		GetNewMessagesResponse response = new GetNewMessagesResponse();

		GetNewMessagesMessageInfo[] msgInfo = new GetNewMessagesMessageInfo[10];

		for (int i = 0; i < msgInfo.length; i++) {
			msgInfo[i] = new GetNewMessagesMessageInfo();
			msgInfo[i].setMessageDeliveryUid("UID" + i);
		}

		response.setMessages(msgInfo);

		return response;
	}

	public DeclineMessagesResponse declineMessages(DeclineMessagesRequest request) {
		DeclineMessagesResponse response = new DeclineMessagesResponse();

		if (request.getMessages() != null) {
			for (DeclineMessagesMessageInfo message : request.getMessages()) {
				// do smth
			}
		}

		return response;
	}

	public DownloadMessageResponse downloadMessage(DownloadMessageRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
