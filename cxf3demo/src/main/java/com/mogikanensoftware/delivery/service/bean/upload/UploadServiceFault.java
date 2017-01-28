package com.mogikanensoftware.delivery.service.bean.upload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mogikanensoftware.delivery.service.bean.AbstractServiceFault;

@XmlRootElement
@XmlType(name="UploadServiceFault")
@XmlAccessorType(XmlAccessType.FIELD)
public class UploadServiceFault extends AbstractServiceFault{

	private static final long serialVersionUID = 1L;

}
