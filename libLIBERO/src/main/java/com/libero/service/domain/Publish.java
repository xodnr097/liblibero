package com.libero.service.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Publish {
	
	private String prodType;
	private int prodNo;
	private String prodName;
	private String prodDetail;
	private String author;
	private int printPrice;
	private int retailPrice;
	private String blindCode;
	private String prodThumbnail;
	private String coverFile;
	private String purposeCode;
	private String manuFile;
	private String discountCode;
	private User optionPrice;
	private int bookPage;
	private String colorType;
	private String sizeType;
	private String coverType;
	private String innerType;
	private String creator;
	private Date regDate;

}
