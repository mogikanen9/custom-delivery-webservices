package com.mogikanensoftware.delivery.service.bean;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class AbstractRequest extends AbstractBean{
	
	private static final long serialVersionUID = 1L;

	private String requestTransactionUid;

	public String getRequestTransactionUid() {
		return requestTransactionUid;
	}

	public void setRequestTransactionUid(String requestTransactionUid) {
		this.requestTransactionUid = requestTransactionUid;
	}
}
