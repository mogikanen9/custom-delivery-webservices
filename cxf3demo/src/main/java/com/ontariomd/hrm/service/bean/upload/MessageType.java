package com.ontariomd.hrm.service.bean.upload;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="MessageType")
@XmlEnum(String.class)
public enum MessageType {
	MR, DI, CRT, BBK, PTH, LAB, MC
}
