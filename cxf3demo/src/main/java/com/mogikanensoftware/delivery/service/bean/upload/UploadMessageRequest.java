package com.mogikanensoftware.delivery.service.bean.upload;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mogikanensoftware.delivery.service.bean.AbstractRequest;

@XmlRootElement
@XmlType(name = "UploadMessageRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class UploadMessageRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "messageInfo", required = true)
	private UploadMessageMessageInfo messageInfo;
	
	@XmlElement(name = "recipients", required = true, type=UploadMessageRecipientInfo.class)
	private UploadMessageRecipientInfo[] recipients;

	@XmlMimeType("application/octet-stream")
	@XmlElement(name = "messageContent", required = true)
	private DataHandler messageContent;

	public UploadMessageRecipientInfo[] getRecipients() {
		return recipients;
	}

	public void setRecipients(UploadMessageRecipientInfo[] recipients) {
		this.recipients = recipients;
	}

	public UploadMessageMessageInfo getMessageInfo() {
		return messageInfo;
	}

	public void setMessageInfo(UploadMessageMessageInfo messageInfo) {
		this.messageInfo = messageInfo;
	}

	public DataHandler getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(DataHandler messageContent) {
		this.messageContent = messageContent;
	}
}
