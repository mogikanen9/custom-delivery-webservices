package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="GetNewMessagesMessageInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetNewMessagesMessageInfo extends AbstractBean{

	private static final long serialVersionUID = 1L;

	@XmlElement(name="messageUid",required=true)
	private String messageUid;
	
	@XmlElement(name="requiresPpmSearch",required=true)
	private boolean requiresPpmSearch = false;

	@XmlElement(name="getNewMessagesPatientMatchCriteria",required=false)
	private GetNewMessagesPatientMatchCriteria patientMatchCriteria;

	public String getMessageUid() {
		return messageUid;
	}

	public void setMessageUid(String messageUid) {
		this.messageUid = messageUid;
	}

	public boolean isRequiresPpmSearch() {
		return requiresPpmSearch;
	}

	public void setRequiresPpmSearch(boolean requiresPpmSearch) {
		this.requiresPpmSearch = requiresPpmSearch;
	}

	public GetNewMessagesPatientMatchCriteria getPatientMatchCriteria() {
		return patientMatchCriteria;
	}

	public void setPatientMatchCriteria(GetNewMessagesPatientMatchCriteria patientMatchCriteria) {
		this.patientMatchCriteria = patientMatchCriteria;
	}
	
	
	
}
