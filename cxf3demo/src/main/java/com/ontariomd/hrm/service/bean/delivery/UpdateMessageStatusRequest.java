package com.ontariomd.hrm.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractRequest;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="UpdateMessageStatusRequest")
public class UpdateMessageStatusRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;

	@XmlElement(name="messages",required=true)
	private UpdateMessageStatusMessageInfo[] messages;

	public UpdateMessageStatusMessageInfo[] getMessages() {
		return messages;
	}

	public void setMessages(UpdateMessageStatusMessageInfo[] messages) {
		this.messages = messages;
	}

	
}
