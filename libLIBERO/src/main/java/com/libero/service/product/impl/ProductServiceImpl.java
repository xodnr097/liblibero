package com.libero.service.product.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libero.common.Search;
import com.libero.service.product.ProductService;

@Service("prouctServiceImpl")
public class ProductServiceImpl implements ProductService{

//	@Autowired
//	@Qualifier("productDAOImpl")
//	private ProductDAO productDAO;
	
	
	///Constructor
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
					System.out.println(this.getClass());
	}

	///Method
	@Override
	public Map<String, Object> getBookList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
