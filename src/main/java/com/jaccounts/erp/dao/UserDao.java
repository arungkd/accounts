package com.jaccounts.erp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jaccounts.erp.pojo.User;
import com.jaccounts.erp.rowmapper.UserRowMapper;

public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * This method will check the user details such as username and pwd
	 * 
	 * @param username {@link String}
	 * @param password {@link String}
	 * @return {@link Integer}
	 */
	public int loginCheck(String username, String password) {

		/*
		 * Return values for this method 0 - success login 1 - invalid user 2 - invalid
		 * pwd
		 */

		System.out.println("---->" + username);

		int result = 2;
		User userResult = null;

		String query = "select userid,username,password from user where username = ?";
		try {
			userResult = (User) jdbcTemplate.queryForObject(query, new Object[] { username }, new UserRowMapper());
		} catch (EmptyResultDataAccessException ex) {
			result = 1;
		}

		if (result != 1 && userResult != null) {
			result = checkusernameandpwd(username, password, userResult);
		}

		return result;
	}

	private int checkusernameandpwd(String username, String password, User userResult) {
		int result = 2;
		if ((username.toLowerCase().equalsIgnoreCase(userResult.getUserName().toLowerCase())
				&& (password.equalsIgnoreCase(userResult.getPassword())))) {
			result = 0;

		}
		return result;
	}
}
