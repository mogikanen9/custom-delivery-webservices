package com.ontariomd.hrm.service.bean.upload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractBean;

@XmlRootElement
@XmlType(name="UploadMessageMessageInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class UploadMessageMessageInfo extends AbstractBean{
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name="patientInfo",required=true)
	private UploadMessagePatientInfo patientInfo;

	@XmlElement(name="messageTypeId",required=true)
	private int messageTypeId;
	
	public int getMessageTypeId() {
		return messageTypeId;
	}

	public void setMessageTypeId(int messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public UploadMessagePatientInfo getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(UploadMessagePatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}
}
