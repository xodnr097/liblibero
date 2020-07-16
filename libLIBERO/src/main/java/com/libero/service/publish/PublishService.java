package com.libero.service.publish;

import java.util.Map;

import com.libero.service.domain.Product;

public interface PublishService {
	
	public Map<String,Object> getPrintOptionList() throws Exception;
	
	public int addPrintOption(Product product) throws Exception;
	
	public int addManu() throws Exception;
	
	

}
