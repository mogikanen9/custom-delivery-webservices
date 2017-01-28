package com.mogikanensoftware.delivery.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mogikanensoftware.delivery.service.bean.AbstractBean;

@XmlRootElement
@XmlType(name="GetNewMessagesMessageInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetNewMessagesMessageInfo extends AbstractBean{

	private static final long serialVersionUID = 1L;

	@XmlElement(name="messageDeliveryUid",required=true)
	private String messageDeliveryUid;

	@XmlElement(name="recipients",required=true)
	private GetNewMessagesRecipientInfo[] recipients = null;		

	@XmlElement(name="requiresPpmSearch",required=true)
	private boolean requiresPpmSearch = false;

	@XmlElement(name="getNewMessagesPatientMatchCriteria",required=false)
	private GetNewMessagesPatientMatchCriteria patientMatchCriteria;

	public GetNewMessagesRecipientInfo[] getRecipients() {
		return recipients;
	}

	public void setRecipients(GetNewMessagesRecipientInfo[] recipients) {
		this.recipients = recipients;
	}
	
	public String getMessageDeliveryUid() {
		return messageDeliveryUid;
	}

	public void setMessageDeliveryUid(String messageDeliveryUid) {
		this.messageDeliveryUid = messageDeliveryUid;
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
