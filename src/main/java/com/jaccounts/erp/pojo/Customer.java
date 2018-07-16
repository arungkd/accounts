package com.jaccounts.erp.pojo;

public class Customer {

	private int customerId;
	private String customerName;
	private String companyName;
	private String contactNumber;
	private String emailId;
	private String address;
	private String panNumber;
	private String GSTNumber;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getGSTNumber() {
		return GSTNumber;
	}
	public void setGSTNumber(String gSTNumber) {
		GSTNumber = gSTNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", companyName=" + companyName
				+ ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", address=" + address + ", panNumber="
				+ panNumber + ", GSTNumber=" + GSTNumber + "]";
	}
}
