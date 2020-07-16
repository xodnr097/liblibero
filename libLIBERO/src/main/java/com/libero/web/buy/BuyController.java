package com.libero.web.buy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.libero.service.buy.BuyService;

@Controller
@RequestMapping("/buy/*")
public class BuyController {
	
	//Field
	@Autowired
	@Qualifier("buyServiceImpl")
	private BuyService buyService;
	
	//Constructor
	public BuyController() {
		System.out.println("[ "+this.getClass()+" ]");
	}
	
	//Method
	@RequestMapping(value="getUserBuy",method=RequestMethod.GET)
	public ModelAndView getUserBuy() throws Exception{
		System.out.println("/buy/getUserBuy : GET");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/buy/getUserBuy.jsp");
		
		return modelAndView;
	}
	
}
