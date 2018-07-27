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

import com.jaccounts.erp.dao.SupplierDao;
import com.jaccounts.erp.pojo.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping(value = "/searchSupplier", method = RequestMethod.POST)
	public ModelAndView searchSpare() {
		ModelAndView model = new ModelAndView();

		getSupplier(model);

		model.setViewName("supplierSearch");

		return model;
	}

	private void getSupplier(ModelAndView model) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			model.addObject("supplierList", mapper.writeValueAsString(supplierDao.searchSpares()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/editSupplier", method = RequestMethod.POST)
	public ModelAndView editSupplier(HttpServletRequest request, @ModelAttribute("supplier") Supplier supplier) {

		ModelAndView model = new ModelAndView();
		int supplierId = supplier.getSupplierid();
		supplier = supplierDao.getSupplierById(supplierId);

		model.addObject("actionName", "updateSupplier");
		model.setViewName("supplierSave");
		model.addObject(supplier);

		return model;
	}
	
	@RequestMapping(value = "/updateSupplier", method = RequestMethod.POST)
	public ModelAndView updateSupplier(HttpServletRequest request, @ModelAttribute("supplier") Supplier supplier) {

		ModelAndView model = new ModelAndView();
		int result = supplierDao.updateSupplierDetails(supplier);

		if (result == 1) {
			getSupplier(model);
			model.setViewName("supplierSearch");
		} else {
			model.addObject("actionName", "updateSupplier");
			model.setViewName("supplierSave");
			model.addObject(supplier);
		}

		return model;
	}
	
	@RequestMapping(value = "/newSupplier", method = RequestMethod.POST)
	public ModelAndView newSupplier(HttpServletRequest request, @ModelAttribute("supplier") Supplier supplier) {
		ModelAndView model = new ModelAndView();
		model.addObject("actionName", "saveSupplier");
		model.setViewName("supplierSave");
		return model;
	}
	
	@RequestMapping(value = "/saveSupplier", method = RequestMethod.POST)
	public ModelAndView saveSpare(HttpServletRequest request, @ModelAttribute("supplier") Supplier supplier) {
		ModelAndView model = new ModelAndView();
		int result = supplierDao.saveSupplierDetails(supplier);
		
		if (result == 1) {
			getSupplier(model);
			model.setViewName("supplierSearch");
		} else {
			model.addObject("actionName", "saveSupplier");
			model.setViewName("supplierSave");
			model.addObject(supplier);
		}
		
		return model;
	}

}
