package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetNewMessagesRequest")
public class GetNewMessagesRequest extends AbstractRequest{
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="emrInstanceKey",required=true)
	private String emrInstanceKey;

	public String getEmrInstanceKey() {
		return emrInstanceKey;
	}

	public void setEmrInstanceKey(String emrInstanceKey) {
		this.emrInstanceKey = emrInstanceKey;
	}
}
