package com.jaccounts.erp.pojo;

import java.io.Serializable;

public class Supplier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8297095153242528553L;
	private int supplierid;
	private String suppliername;
	private String supplieraddress;
	private String supplieremail;
	private String supplierphone;
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplieraddress() {
		return supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	public String getSupplieremail() {
		return supplieremail;
	}
	public void setSupplieremail(String supplieremail) {
		this.supplieremail = supplieremail;
	}
	public String getSupplierphone() {
		return supplierphone;
	}
	public void setSupplierphone(String supplierphone) {
		this.supplierphone = supplierphone;
	}
	
	
}
