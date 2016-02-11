package com.ontariomd.hrm.service.bean.upload;

import java.util.Calendar;

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

	@XmlElement(name="msgType",required=true)
	private MessageType messageType;
	
	@XmlElement(name="msgUid",required=true)
	private String messageUid;
	
	@XmlElement(name="sendingFacilityId",required=true)
	private String sendingFacilityId;
	
	@XmlElement(name="messageReceivedDate",required=true)
	private Calendar messageReceivedDate;
	
	public Calendar getMessageReceivedDate() {
		return messageReceivedDate;
	}

	public void setMessageReceivedDate(Calendar messageReceivedDate) {
		this.messageReceivedDate = messageReceivedDate;
	}

	public String getSendingFacilityId() {
		return sendingFacilityId;
	}

	public void setSendingFacilityId(String sendingFacilityId) {
		this.sendingFacilityId = sendingFacilityId;
	}

	public String getMessageUid() {
		return messageUid;
	}

	public void setMessageUid(String messageUid) {
		this.messageUid = messageUid;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

	public UploadMessagePatientInfo getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(UploadMessagePatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}
}
