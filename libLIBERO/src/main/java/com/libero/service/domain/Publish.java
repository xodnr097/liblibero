package com.libero.service.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Publish {
	
	private String author;
	private int printPrice;
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
