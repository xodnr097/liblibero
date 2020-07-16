package com.libero.web.publish;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.libero.service.publish.PublishService;

@Controller
@RequestMapping("/publish/*")
public class PublishController {
	
	//Field
	@Autowired
	@Qualifier("publishServiceImpl")
	private PublishService publishService;
	
	//Constructor
	public PublishController(){
		System.out.println(this.getClass());
	}
	
	//method
	@RequestMapping(value="selectProdType", method = RequestMethod.GET)
	public ModelAndView selectProdType() throws Exception {
		
		System.out.println("/publish/selectProdType : GET");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/publish/selectProductType.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "addPrintOption", method = RequestMethod.GET)
	public ModelAndView addPrintOption(HttpSession session) throws Exception {
		
		System.out.println("/publish/addPrintOption : GET");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/publish/addPrintOption.jsp");
		
		return modelAndView;
	}
}
