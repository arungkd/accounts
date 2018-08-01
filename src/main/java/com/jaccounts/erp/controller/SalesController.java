package com.jaccounts.erp.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jaccounts.erp.dao.DummyDB;
import com.jaccounts.erp.dao.SalesDao;
import com.jaccounts.erp.pojo.BillDetails;

@Controller
public class SalesController {

	@Autowired
	SalesDao salesDao;

	private static DummyDB dummyDB = new DummyDB();
	
	@RequestMapping(value = "/newBill", method = RequestMethod.POST)
	public ModelAndView newSparesBill(HttpServletRequest request,
			@ModelAttribute("billDetails") BillDetails billDetails) {
		ModelAndView view = new ModelAndView();

		Map<Integer, Object> companyMap = new HashMap<>();

		companyMap = salesDao.getCompanyList();

		view.addObject("companyMap", companyMap);
		view.setViewName("newBill");

		return view;
	}

	@RequestMapping(value = "/savebill", method = RequestMethod.POST)
	public ModelAndView saveSparesBill(HttpServletRequest request,
			@ModelAttribute("billDetails") BillDetails billDetails) {
		ModelAndView view = new ModelAndView();

		Map<Integer, Object> companyMap = new HashMap<>();

		companyMap = salesDao.getCompanyList();

		view.addObject("companyMap", companyMap);
		view.setViewName("newBill");

		System.out.println("---->" + billDetails.getCompanyName());
		System.out.println("---->" + billDetails.getBillDate());
		System.out.println("---->" + billDetails.getBillTime());

		billDetails.setCompanyName("10");

		return view;
	}

	@RequestMapping(value = "/get_spare_list", method = RequestMethod.GET)
	public @ResponseBody String getCountryList(@RequestParam("term") String query) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("000000000000000");
		List<String> spareList = salesDao.getSpareList(query);

		ObjectMapper mapper = new ObjectMapper();
		System.out.println("------"+spareList);
		return mapper.writeValueAsString(spareList);
	}

	@RequestMapping(value = "/get_tech_list", method = RequestMethod.GET)
	public @ResponseBody String getTechList(@RequestParam("term") String query) throws JsonGenerationException, JsonMappingException, IOException {
		List<String> countryList = dummyDB.getTechList(query);

		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(countryList);
	}

}
