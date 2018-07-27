package com.jaccounts.erp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jaccounts.erp.pojo.Supplier;

public class SupplierDao {

	private static final String SELECTSUPPLIER = "SELECT * FROM SUPPLIERMASTER";
	private static final String SELECTSUPPLIERBYID = "SELECT * FROM SUPPLIERMASTER WHERE SUPPLIERID = ?";
	private static final String UPDATESUPPLIERBYID = "UPDATE SUPPLIERMASTER SET SUPPLIERNAME = ?,SUPPLIERADDRESS = ?, SUPPLIEREMAIL = ?, SUPPLIERPHONE = ? WHERE SUPPLIERID = ?";
	private static final String SAVESUPPLIER = "INSERT INTO SUPPLIERMASTER (SUPPLIERNAME,SUPPLIERADDRESS,SUPPLIEREMAIL,SUPPLIERPHONE) VALUES (?,?,?,?)";
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Object searchSpares() {
		List<Supplier> queryResult = jdbcTemplate.query(SELECTSUPPLIER, new BeanPropertyRowMapper<>(Supplier.class));

		if (queryResult == null) {
			queryResult = new ArrayList<Supplier>();
		}

		return queryResult;
	}

	public Supplier getSupplierById(int supplierId) {
		Supplier supplier = jdbcTemplate.queryForObject(SELECTSUPPLIERBYID, new Object[] { supplierId },
				new BeanPropertyRowMapper<>(Supplier.class));

		return supplier;
	}

	public int updateSupplierDetails(Supplier supplier) {
		int result = jdbcTemplate.update(UPDATESUPPLIERBYID,
				new Object[] { supplier.getSuppliername(), supplier.getSupplieraddress(), supplier.getSupplieremail(),
						supplier.getSupplierphone(), supplier.getSupplierid() });
		return result;
	}

	public int saveSupplierDetails(Supplier supplier) {
		int result = jdbcTemplate.update(SAVESUPPLIER, new Object[] { supplier.getSuppliername(),
				supplier.getSupplieraddress(), supplier.getSupplieremail(), supplier.getSupplierphone()});
		return result;
	}
}
