package com.jaccounts.erp.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jaccounts.erp.pojo.Spares;

public class SparesDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	final static Logger logger = Logger.getLogger(SparesDao.class);

	private String SELECTSPARES = "SELECT * FROM SPARES";
	private String SELECTSPAREBYID = "SELECT * FROM SPARES WHERE SPAREID = ?";
	private String UPDATESPAREBYID = "UPDATE SPARES SET SPARENAME = ?,SPAREUNIT = ?,SPAREDESCRIPTION = ?,SPAREPRICE = ?,SPARESTOCK = ?,SPARECODE = ? WHERE SPAREID = ?";
	private String SAVESPARES = "INSERT INTO SPARES(SPARENAME,SPAREUNIT,SPAREDESCRIPTION,SPAREPRICE,SPARESTOCK,SPARECODE,SUPPLIERID) VALUES(?,?,?,?,?,?,1)";

	public List<Spares> searchSpares() {
		List<Spares> queryResult = jdbcTemplate.query(SELECTSPARES, new BeanPropertyRowMapper<>(Spares.class));

		if (queryResult == null) {
			queryResult = new ArrayList<Spares>();
		}

		return queryResult;
	}

	public Spares getSpareById(int spareId) {

		Spares spares = jdbcTemplate.queryForObject(SELECTSPAREBYID, new Object[] { spareId },
				new BeanPropertyRowMapper<>(Spares.class));

		return spares;
	}

	public int updateSpareDetails(Spares spares) {
		int result = jdbcTemplate.update(UPDATESPAREBYID,
				new Object[] { spares.getSparename(), spares.getSpareunit(), spares.getSparedescription(),
						spares.getSpareprice(), spares.getSparestock(), spares.getSparecode(), spares.getSpareid()});
		return result;
	}

	public int saveSpareDetails(Spares spares) {
		int result = jdbcTemplate.update(SAVESPARES,new Object[] {spares.getSparename(), spares.getSpareunit(), spares.getSparedescription(),
				spares.getSpareprice(), spares.getSparestock(), spares.getSparecode()});
		return result;
	}
}
