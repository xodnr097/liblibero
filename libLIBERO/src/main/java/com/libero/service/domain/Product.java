package com.libero.service.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Product {
	
	private int prodNo;
	private String prodType;
	private String prodName;
	private String prodDetail;
	private int retailPrice;
	//private User userId
	private String blindCode;
	private String prod_thumbnail;
	private String coverFile;
	private Date regDate;
	private String discountCode;
	private String creator;
	private int salesCount;
	private int likeCount;
	private Publish printOption;

}
