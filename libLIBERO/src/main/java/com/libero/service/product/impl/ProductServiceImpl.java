package com.libero.service.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.libero.common.Search;
import com.libero.service.domain.Product;
import com.libero.service.product.ProductService;

@Service("prouctServiceImpl")
public class ProductServiceImpl implements ProductService{

	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
					this.productDao = productDao;
	}
	
	
	///Constructor
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
					System.out.println(this.getClass());
	}

	///Method
	
	
	@Override
	public Map<String, Object> getProductList(Search search) throws Exception {
		// TODO Auto-generated method stub
		List<Product> list= productDao.getProductList(search);
		int totalCount = productDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("totalCount", new Integer(totalCount));
		return map;
	}

}
