package com.libero.service.publish;

import java.util.Map;

import com.libero.service.domain.Product;

public interface PublishService {
	
	public Map<String,Object> getPrintOptionList() throws Exception;
	
	public void addPrintOption(Product product) throws Exception;
	
	public void getPulish(String prodNo) throws Exception;
	
	public void updateManu(String prodNo) throws Exception;
	
	public void updatePublishInfo() throws Exception;
	
	public void updateRetailPrice() throws Exception;
	
	public void addProduct(Product product) throws Exception;
	
	public void updateProduct(String prodNo) throws Exception;
	
	public void addOptionPrice() throws Exception;
	
	public void getOptionPrice() throws Exception;
	
	public void updateOptionPrice() throws Exception;

}
