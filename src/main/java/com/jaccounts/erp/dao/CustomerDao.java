package com.jaccounts.erp.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jaccounts.erp.pojo.Customer;

public class CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	final static Logger logger = Logger.getLogger(CustomerDao.class);

	String customerInsert = "insert into customer (customername,companyname,contactnumber,emailid,address,pannumber,GSTnumber) "
			+ "values(?,?,?,?,?,?,?)";

	public int saveCustomer(Customer customer) {

		logger.debug("Going to save custmer details " + customer);

		// int value = jdbcTemplate.update(customerInsert);

		int value = jdbcTemplate.update(customerInsert,
				new Object[] { customer.getCustomerName(), customer.getCompanyName(), customer.getContactNumber(),
						customer.getEmailId(), customer.getAddress(), "", customer.getGSTNumber() });

		logger.debug("Executed results = " + value);

		return value;
	}
}
