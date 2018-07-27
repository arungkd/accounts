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

import com.jaccounts.erp.dao.SparesDao;
import com.jaccounts.erp.pojo.Spares;

@Controller
public class SparesController {

	@Autowired
	SparesDao sparesDao;

	@RequestMapping(value = "/searchSpares", method = RequestMethod.POST)
	public ModelAndView searchSpare() {
		ModelAndView model = new ModelAndView();

		getSpares(model);

		model.setViewName("sparesSearch");

		return model;
	}

	private void getSpares(ModelAndView model) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			model.addObject("sparesList", mapper.writeValueAsString(sparesDao.searchSpares()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/editSpare", method = RequestMethod.POST)
	public ModelAndView editSpare(HttpServletRequest request, @ModelAttribute("spares") Spares spares) {

		ModelAndView model = new ModelAndView();
		int spareId = spares.getSpareid();
		spares = sparesDao.getSpareById(spareId);

		model.addObject("actionName", "updateSpare");
		model.setViewName("sparesSave");
		model.addObject(spares);

		return model;
	}

	@RequestMapping(value = "/updateSpare", method = RequestMethod.POST)
	public ModelAndView updateSpare(HttpServletRequest request, @ModelAttribute("spares") Spares spares) {

		ModelAndView model = new ModelAndView();
		int result = sparesDao.updateSpareDetails(spares);

		if (result == 1) {
			getSpares(model);
			model.setViewName("sparesSearch");
		} else {
			model.addObject("actionName", "updateSpare");
			model.setViewName("sparesSave");
			model.addObject(spares);
		}

		return model;
	}

	@RequestMapping(value = "/newSpare", method = RequestMethod.POST)
	public ModelAndView newSpare(HttpServletRequest request, @ModelAttribute("spares") Spares spares) {
		ModelAndView model = new ModelAndView();
		model.addObject("actionName", "saveSpare");
		model.setViewName("sparesSave");
		return model;
	}
	
	@RequestMapping(value = "/saveSpare", method = RequestMethod.POST)
	public ModelAndView saveSpare(HttpServletRequest request, @ModelAttribute("spares") Spares spares) {
		ModelAndView model = new ModelAndView();
		int result = sparesDao.saveSpareDetails(spares);
		
		if (result == 1) {
			getSpares(model);
			model.setViewName("sparesSearch");
		} else {
			model.addObject("actionName", "saveSpare");
			model.setViewName("sparesSave");
			model.addObject(spares);
		}
		
		return model;
	}
}
