package com.mogikanensoftware.delivery.service.bean.delivery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="MessageStatus")
@XmlEnum(String.class)
public enum MessageStatus {
	DELIVERED, REJECTED
}
