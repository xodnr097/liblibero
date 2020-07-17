package com.libero.service.product.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.libero.service.domain.Product;
import com.libero.service.product.ProductDAO;
import com.libero.service.product.ProductService;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService{

	@Autowired
	@Qualifier("productDAOImpl")
	private ProductDAO productDAO;
	public void setProductDAO(ProductDAO productDAO) {
					this.productDAO = productDAO;
	}
	
	
	
	///Constructor
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
					System.out.println("3");
					System.out.println(this.getClass());
	}

	///Method
	@Override
	public Map<String, Object> getBookList() throws Exception {
		System.out.println("4");
		// TODO Auto-generated method stub
		List<Product> list = productDAO.getBookList();
		System.out.println("5");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		System.out.println(list);
		
		return map;
	}

}
