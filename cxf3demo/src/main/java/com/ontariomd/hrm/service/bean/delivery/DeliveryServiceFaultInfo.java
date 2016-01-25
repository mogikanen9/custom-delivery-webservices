package com.ontariomd.hrm.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ontariomd.hrm.service.bean.AbstractServiceFault;

@XmlRootElement
@XmlType(name="DeliveryServiceFaultInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeliveryServiceFaultInfo extends AbstractServiceFault{

	private static final long serialVersionUID = 1L;
	
}
