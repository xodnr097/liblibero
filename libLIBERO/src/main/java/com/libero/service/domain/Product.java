package com.libero.service.domain;

import java.sql.Date;

import lombok.Data;

public class Product {
	
	private int prodNo;
	private String prodType;
	private String prodName;
	private String prodDetail;
	private int retailPrice;
	//private User userId
	private int printPrice;
	private String blindCode;
	private String prodThumbnail;
	private String coverFile;
	private Date regDate;
	private String discountCode;
	private String creator;
	private int salesCount;
	private int likeCount;
	private Publish printOption;
	private String author;
	private String purposeCode;
	private String manuFile;
	private int bookPage;
	private String colorType;
	private String sizeType;
	private String coverType;
	private String innerType;
	private short tempCode;
	private User factoryId;
	
	public Product() {
		
	}
	
	
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public int getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}
	public int getPrintPrice() {
		return printPrice;
	}
	public void setPrintPrice(int printPrice) {
		this.printPrice = printPrice;
	}
	public String getBlindCode() {
		return blindCode;
	}
	public void setBlindCode(String blindCode) {
		this.blindCode = blindCode;
	}
	public String getProdThumbnail() {
		return prodThumbnail;
	}
	public void setProdThumbnail(String prodThumbnail) {
		this.prodThumbnail = prodThumbnail;
	}
	public String getCoverFile() {
		return coverFile;
	}
	public void setCoverFile(String coverFile) {
		this.coverFile = coverFile;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public Publish getPrintOption() {
		return printOption;
	}
	public void setPrintOption(Publish printOption) {
		this.printOption = printOption;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPurposeCode() {
		return purposeCode;
	}
	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}
	public String getManuFile() {
		return manuFile;
	}
	public void setManuFile(String manuFile) {
		this.manuFile = manuFile;
	}
	public int getBookPage() {
		return bookPage;
	}
	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}
	public String getColorType() {
		return colorType;
	}
	public void setColorType(String colorType) {
		this.colorType = colorType;
	}
	public String getSizeType() {
		return sizeType;
	}
	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}
	public String getCoverType() {
		return coverType;
	}
	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}
	public String getInnerType() {
		return innerType;
	}
	public void setInnerType(String innerType) {
		this.innerType = innerType;
	}
	public short getTempCode() {
		return tempCode;
	}
	public void setTempCode(short tempCode) {
		this.tempCode = tempCode;
	}
	public User getFactoryId() {
		return factoryId;
	}
	public void setFactoryId(User factoryId) {
		this.factoryId = factoryId;
	}

}

	



