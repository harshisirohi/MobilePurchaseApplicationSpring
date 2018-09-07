package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="purchasedetails")
public class PurchaseDetails 
{
	@Id
	@Column(name="PURCHASEID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="purchase",allocationSize=1)
	private Integer purchaseId;
	
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Z][a-zA-Z]{3,15}", message="Name should contain min 3 and max 15 letters")
	@Column(name="CNAME")
	private String custName;
	
	@Column(name="PHONENO")
	@NotEmpty(message="Phone no is mandatory")
	@Pattern(regexp="[0-9]{10}", message="Phone no should contain 10 digits")
	private String phoneNo;
	
	@Column(name="mailid")
	@Email(message="Enter valid email id")
	private String emailId;
	
	@Column(name="purchaseDate")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}", message="Date must be valid")
	private String puchaseDate;
	
	@Column(name="mobileId")
	private Integer mobileId;

	
	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPuchaseDate() {
		return puchaseDate;
	}

	public void setPuchaseDate(String puchaseDate) {
		this.puchaseDate = puchaseDate;
	}

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public PurchaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", custName="
				+ custName + ", phoneNo=" + phoneNo + ", emailId=" + emailId
				+ ", puchaseDate=" + puchaseDate + ", mobileId=" + mobileId
				+ "]";
	}
	
	

}
