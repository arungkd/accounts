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
import com.jaccounts.erp.pojo.Customer;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao customerDao;

	@RequestMapping(value = "/newCustomer", method = RequestMethod.POST)
	public ModelAndView newCustomer(HttpServletRequest request, @ModelAttribute("customer") Customer customer) {

		ModelAndView model = new ModelAndView();
		model.addObject("actionName", "saveCustomer");
		model.setViewName("customerSave");

		return model;
	}
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView home(HttpServletRequest request, @ModelAttribute("customer") Customer customer) {

		System.out.println("Customer Name ---->"+ customer.getCustomername());
		
		int result = customerDao.saveCustomer(customer);

		ModelAndView model = new ModelAndView();
		// model.addObject("username", login.getUsername());
		model.setViewName("landingpage");

		System.out.println("--->"+result);
		
		if (result == 1) {
			model.setViewName("landingpage");
			model.addObject("alertView","success");
			ObjectMapper mapper = new ObjectMapper();
			try {
				model.addObject("customerList", mapper.writeValueAsString(customerDao.getCustomerByValue()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return model;
	}

	@RequestMapping(value = "/editCustomer", method = RequestMethod.POST)
	public ModelAndView editCustomer(HttpServletRequest request, @ModelAttribute("customer") Customer customer) {
		ModelAndView model = new ModelAndView();
		
		
		customer = customerDao.getCustomerDetailsById(customer.getCustomerid());
		model.addObject("isEdit", true);
		model.addObject("actionName", "updateCustomer");
		model.setViewName("customerSave");
		model.addObject(customer);

		return model;
	}
	
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
	public ModelAndView updateCustomer(HttpServletRequest request, @ModelAttribute("customer") Customer customer) {
		ModelAndView model = new ModelAndView();
		
		int result = customerDao.updateCustomerDetails(customer);
		//model.addObject("isEdit", true);
		
		if (result == 1) {
			model.setViewName("landingpage");
			model.addObject("alertView","success");
			ObjectMapper mapper = new ObjectMapper();
			try {
				model.addObject("customerList", mapper.writeValueAsString(customerDao.getCustomerByValue()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			model.setViewName("customerSave");
			model.addObject("actionName", "updateCustomer");
			model.addObject(customer);
		}
		
		
		

		return model;
	}
}
