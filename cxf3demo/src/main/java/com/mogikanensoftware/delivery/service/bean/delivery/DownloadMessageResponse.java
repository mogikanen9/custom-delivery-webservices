package com.mogikanensoftware.delivery.service.bean.delivery;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mogikanensoftware.delivery.service.bean.AbstractResponse;

@XmlRootElement
@XmlType(name="DownloadMessageResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class DownloadMessageResponse extends AbstractResponse{

	
	private static final long serialVersionUID = 1L;

	private DataHandler dataHandler;

	public DataHandler getDataHandler() {
		return dataHandler;
	}

	public void setDataHandler(DataHandler dataHandler) {
		this.dataHandler = dataHandler;
	}
}
