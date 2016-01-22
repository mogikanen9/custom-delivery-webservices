package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadMessageRequest")
public class DownloadMessageRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "messageUid", required = true)
	private String messageUid;

	@XmlElement(name = "emrSpecVersion", required = true)
	private String emrSpecVersion;


	public String getMessageUid() {
		return messageUid;
	}

	public void setMessageUid(String messageUid) {
		this.messageUid = messageUid;
	}

	public String getEmrSpecVersion() {
		return emrSpecVersion;
	}

	public void setEmrSpecVersion(String emrSpecVersion) {
		this.emrSpecVersion = emrSpecVersion;
	}

}
