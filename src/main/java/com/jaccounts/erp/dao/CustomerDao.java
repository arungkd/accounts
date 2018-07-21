package com.jaccounts.erp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jaccounts.erp.pojo.Customer;

public class CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	final static Logger logger = Logger.getLogger(CustomerDao.class);

	String customerInsert = "insert into customer (customername,companyname,contactnumber,emailid,address,pannumber,GSTnumber) "
			+ "values(?,?,?,?,?,?,?)";

	private String selectCustomerById = "SELECT * FROM CUSTOMER WHERE CUSTOMERID=?";
	
	private String updateCustomerDetailsQuery = "UPDATE CUSTOMER SET CUSTOMERNAME=?,COMPANYNAME = ?, "
			+ "CONTACTNUMBER =?, EMAILID =?, ADDRESS =?, PANNUMBER = ?, GSTNUMBER =? WHERE CUSTOMERID=?";
	
	public int saveCustomer(Customer customer) {

		logger.debug("Going to save custmer details " + customer);

		// int value = jdbcTemplate.update(customerInsert);

		int value = jdbcTemplate.update(customerInsert,
				new Object[] { customer.getCustomername(), customer.getCompanyname(), customer.getContactnumber(),
						customer.getEmailid(), customer.getAddress(), "", customer.getGSTnumber() });

		logger.debug("Executed results = " + value);

		return value;
	}

	public List<Customer> getCustomerByValue() {
		
		List<Customer> customerList = jdbcTemplate.query("select * from customer", new BeanPropertyRowMapper(Customer.class));
		
		System.out.println(customerList.toString());
		
		return customerList;
	}

	public Customer getCustomerDetailsById(int customerid) {
		Customer customer = (Customer) jdbcTemplate.queryForObject(selectCustomerById,new Object[] {customerid}, new BeanPropertyRowMapper(Customer.class));
		return customer;
	}

	public int updateCustomerDetails(Customer customer) {
		int value = jdbcTemplate.update(updateCustomerDetailsQuery, 
				new Object[] { customer.getCustomername(), customer.getCompanyname(), customer.getContactnumber(),
						customer.getEmailid(), customer.getAddress(), "", customer.getGSTnumber(), customer.getCustomerid() });
		
		return value;
	}
}
