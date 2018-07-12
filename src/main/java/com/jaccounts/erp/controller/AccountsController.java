package com.jaccounts.erp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jaccounts.erp.model.Login;


@Controller
public class AccountsController {

	
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
		ModelAndView model = new ModelAndView();
		model.addObject("username", login.getUsername());
		model.setViewName("landingpage");
		return model;
	}

}
