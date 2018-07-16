package com.jaccounts.erp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jaccounts.erp.dao.UserDao;
import com.jaccounts.erp.model.Login;


@Controller
public class AccountsController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView  home(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
	
	
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public ModelAndView  home(HttpServletRequest request,@ModelAttribute("login")Login login) {
		System.out.println("username is - "+login.getUsername());
		System.out.println("password is - "+login.getPassword());
		
		
		int loginstatus = userDao.loginCheck(login.getUsername(), login.getPassword());
		
		System.out.println("------->"+loginstatus);
		
		ModelAndView model = new ModelAndView();
		if (loginstatus==0) {
			model.addObject("username", login.getUsername());
			model.setViewName("landingpage");
		} else  {
			model.addObject("username", login.getUsername());
			model.setViewName("login");
		}
		
		
		
		return model;
	}

}
