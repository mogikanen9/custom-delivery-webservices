package com.ontariomd.hrm.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractBean;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclineMessagesMessageInfo")
public class DeclineMessagesMessageInfo extends AbstractBean {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "messageDeliveryUid", required = true)
	private String messageDeliveryUid;

	@XmlElement(name = "status", required = true)
	private String status;

	public String getMessageDeliveryUid() {
		return messageDeliveryUid;
	}

	public void setMessageDeliveryUid(String messageDeliveryUid) {
		this.messageDeliveryUid = messageDeliveryUid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
