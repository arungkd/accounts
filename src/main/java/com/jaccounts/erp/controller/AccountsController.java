package com.jaccounts.erp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jaccounts.erp.dao.CustomerDao;
import com.jaccounts.erp.dao.UserDao;
import com.jaccounts.erp.model.Login;


@Controller
public class AccountsController {

	@Autowired
	UserDao userDao;
	
	@Autowired
	CustomerDao customerDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView  home(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("loginPage");
		return model;
	}
	
	
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public ModelAndView  home(HttpServletRequest request,@ModelAttribute("login")Login login) {
		
		int loginstatus = 0;
		//userDao.loginCheck(login.getUsername(), login.getPassword());
		
		ModelAndView model = new ModelAndView();
		ObjectMapper mapper = new ObjectMapper();
		try {
			model.addObject("customerList", mapper.writeValueAsString(customerDao.getCustomerByValue()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("------->"+loginstatus);
		
		
		/*if (loginstatus==0) {
			model.addObject("username", login.getUsername());
			model.setViewName("landinglayout");
		} else  {
			model.addObject("username", login.getUsername());
			model.setViewName("login");
		}*/
		
		model.addObject("username", login.getUsername());
		model.setViewName("landinglayout");
		
		return model;
	}

}
