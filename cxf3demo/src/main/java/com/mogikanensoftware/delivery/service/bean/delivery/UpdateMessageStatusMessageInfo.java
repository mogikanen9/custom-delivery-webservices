package com.mogikanensoftware.delivery.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mogikanensoftware.delivery.service.bean.AbstractBean;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMessageStatusMessageInfo")
public class UpdateMessageStatusMessageInfo extends AbstractBean {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "messageDeliveryUid", required = true)
	private String messageDeliveryUid;

	@XmlElement(name = "status", required = true)
	private MessageStatus status;

	@XmlElement(name = "reason", required = false)
	private MessageStatusReason reason;

	public String getMessageDeliveryUid() {
		return messageDeliveryUid;
	}

	public void setMessageDeliveryUid(String messageDeliveryUid) {
		this.messageDeliveryUid = messageDeliveryUid;
	}

	public MessageStatus getStatus() {
		return status;
	}

	public void setStatus(MessageStatus status) {
		this.status = status;
	}

	public MessageStatusReason getReason() {
		return reason;
	}

	public void setReason(MessageStatusReason reason) {
		this.reason = reason;
	}

}
