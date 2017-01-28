package com.mogikanensoftware.delivery.service.bean.delivery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="MessageStatusReason")
@XmlEnum(String.class)
public enum MessageStatusReason {
	PATIENT_NOT_FOUND,MESSAGE_PARSING_ERROR, MESSAGE_DOWNLOAD_ERROR
}
