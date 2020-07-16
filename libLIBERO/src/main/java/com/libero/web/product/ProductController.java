package com.libero.web.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.libero.service.product.ProductService;

@Controller
@RequestMapping("/product/*")
public class ProductController{
	
	//Field
	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;
	
	//Constructor
	public ProductController() {
		System.out.println(this.getClass());
	}
	
	//method
	@RequestMapping(value="getBookList", method = RequestMethod.GET)
	public ModelAndView getBookList() throws Exception {
		System.out.println("/product/getBookList:GET");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/product/getBookList.jsp");
		
	}
	
}

public class ProductController {

	public ProductController() {
		// TODO Auto-generated constructor stub
	}

}
