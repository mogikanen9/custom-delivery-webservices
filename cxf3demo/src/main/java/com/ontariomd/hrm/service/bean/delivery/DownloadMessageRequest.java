package com.ontariomd.hrm.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractRequest;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadMessageRequest")
public class DownloadMessageRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@XmlMimeType("application/octet-stream")
	@XmlElement(name = "messageDeliveryUid", required = true)
	private String messageDeliveryUid;

	@XmlElement(name = "emrSpecVersion", required = true)
	private String emrSpecVersion;


	public String getMessageDeliveryUid() {
		return messageDeliveryUid;
	}

	public void setMessageDeliveryUid(String messageDeliveryUid) {
		this.messageDeliveryUid = messageDeliveryUid;
	}

	public String getEmrSpecVersion() {
		return emrSpecVersion;
	}

	public void setEmrSpecVersion(String emrSpecVersion) {
		this.emrSpecVersion = emrSpecVersion;
	}

}
