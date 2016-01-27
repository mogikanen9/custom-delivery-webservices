package com.ontariomd.hrm.service.bean.delivery;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractRequest;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetNewMessagesRequest")
public class GetNewMessagesRequest extends AbstractRequest{
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="emrInstanceKey",required=true)
	private String emrInstanceKey;
	
	@XmlElement(name="from", required=false)
	@XmlSchemaType(name="dateTime")
	private Calendar from;
	
	@XmlElement(name="to", required=false)
	@XmlSchemaType(name="dateTime")
	private Calendar to;
	
	public Calendar getFrom() {
		return from;
	}

	public void setFrom(Calendar from) {
		this.from = from;
	}

	public Calendar getTo() {
		return to;
	}

	public void setTo(Calendar to) {
		this.to = to;
	}	

	public String getEmrInstanceKey() {
		return emrInstanceKey;
	}

	public void setEmrInstanceKey(String emrInstanceKey) {
		this.emrInstanceKey = emrInstanceKey;
	}
}
