package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "GetNewMessagesPatientMatchCriteria")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetNewMessagesPatientMatchCriteria extends AbstractBean {

	private static final long serialVersionUID = 1L;

	@XmlElement(name="hcNumber")
	private String hcNumber;
	
	@XmlElement(name="hcProvince")
	private String hcProvince;
	
	@XmlElement(name="firstName")
	private String firstName;
	
	@XmlElement(name="lastName")
	private String lastName;
	
	@XmlElement(name="dob")
	private String dob;

	public String getHcNumber() {
		return hcNumber;
	}

	public void setHcNumber(String hcNumber) {
		this.hcNumber = hcNumber;
	}

	public String getHcProvince() {
		return hcProvince;
	}

	public void setHcProvince(String hcProvince) {
		this.hcProvince = hcProvince;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
