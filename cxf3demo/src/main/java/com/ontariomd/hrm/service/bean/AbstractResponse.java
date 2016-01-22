package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class AbstractResponse extends AbstractBean{
	
	private static final long serialVersionUID = 1L;

	private String responseTransactionUid;

	public String getResponseTransactionUid() {
		return responseTransactionUid;
	}

	public void setResponseTransactionUid(String responseTransactionUid) {
		this.responseTransactionUid = responseTransactionUid;
	}
	
}
