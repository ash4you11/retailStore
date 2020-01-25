package com.retails.model;

import com.retails.constants.ItemType;

/*
 * User Class to store information about the product 
 */
public class Product {
	
	 private  String productName;
	 private  double productPrice;
	 private  ItemType productType;
	 private int productId;
	 private int productCount;
	
	
	public Product(String productName, double productPrice, ItemType productType, int productId, int productCount) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productId = productId;
		this.productCount = productCount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public ItemType getProductType() {
		return productType;
	}
	public void setProductType(ItemType productType) {
		this.productType = productType;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	  
	

}
