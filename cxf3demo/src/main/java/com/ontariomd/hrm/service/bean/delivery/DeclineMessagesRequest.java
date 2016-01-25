package com.ontariomd.hrm.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractRequest;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DeclineMessagesRequest")
public class DeclineMessagesRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;

	@XmlElement(name="messages",required=true)
	private DeclineMessagesMessageInfo[] messages;

	public DeclineMessagesMessageInfo[] getMessages() {
		return messages;
	}

	public void setMessages(DeclineMessagesMessageInfo[] messages) {
		this.messages = messages;
	}

	
}
