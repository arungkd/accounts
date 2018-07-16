package com.jaccounts.erp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jaccounts.erp.dao.CustomerDao;
import com.jaccounts.erp.pojo.Customer;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView  home(HttpServletRequest request,@ModelAttribute("customer")Customer customer) {
		
		
		customerDao.saveCustomer(customer);
		
		ModelAndView model = new ModelAndView();
			//model.addObject("username", login.getUsername());
			model.setViewName("landingpage");
		
		
		return model;
	}
}
