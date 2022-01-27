package com.precisely.xml2json.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.precisely.models.ParseXMLToJSON;
@Controller
public class MainController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	
	
	@RequestMapping("/result")
	public ModelAndView displayJSON(@RequestParam(value="xml_data") String xml) {
		ModelAndView mav = new ModelAndView("result");
		String result= ParseXMLToJSON.parse(xml);
		mav.addObject("result", result);
		return mav;
	}
}
