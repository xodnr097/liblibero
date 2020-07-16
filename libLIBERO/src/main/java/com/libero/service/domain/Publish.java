package com.libero.service.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Publish implements Serializable {
	
	private String author;
	private int printPrice;
	private String purposeCode;
	private String manuFile;
	private String discountCode;
	private int bookPage;
	private String colorType;
	private String sizeType;
	private String coverType;
	private String innerType;
	private int tempCode;
	private User factoryId;

}
