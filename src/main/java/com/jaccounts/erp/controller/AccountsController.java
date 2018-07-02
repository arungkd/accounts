package com.jaccounts.erp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AccountsController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/getDetails", method = RequestMethod.GET)
	@ResponseBody
	public String home(HttpServletRequest request) {
		
		return "home";
	}

}
