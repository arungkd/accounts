package com.jaccounts.erp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SalesDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private static String COMPANYQUERY = "SELECT CUSTOMERID,COMPANYNAME FROM CUSTOMER";
	private static String SPARESSEARCH = "SELECT SPARENAME FROM SPARES WHERE SPARENAME LIKE ?";
	
	public Map<Integer, Object> getCompanyList() {
		
		Map<Integer, Object> resultMap = new HashMap<>();
		List<Map<String, Object>> queryResult = jdbcTemplate.queryForList(COMPANYQUERY);
		
		for(int i=0; i < queryResult.size(); i++) {
			Map<String, Object> innerMap = queryResult.get(i);
			
			resultMap.put((Integer) innerMap.get("CUSTOMERID"), innerMap.get("COMPANYNAME"));
			
		}
		
		return resultMap;
	}

	public List<String> getSpareList(String query) {
		List<String> spareList = jdbcTemplate.queryForList(SPARESSEARCH,new Object[] {"%"+query+"%"},String.class);
		return spareList;
	}
	
	
}
