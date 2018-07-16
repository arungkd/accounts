package com.jaccounts.erp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jaccounts.erp.pojo.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserName(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}
