package com.retails.cart;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.retails.constants.ItemType;
import com.retails.constants.UserType;
import com.retails.model.Product;
import com.retails.model.User;
import com.retails.service.DiscountService;
import com.retails.serviceImpl.DiscountServiceImpl;



public class ProductCart {
	 	//private Map<Product, Integer> quantities;
	    private DiscountService discountService=new DiscountServiceImpl();
	    private User user;
	    Date date;
	    List<Product> productList;
	    
	    public ProductCart(User user,  List<Product> productList) {
	        this.user = user;
	        this.productList = productList;
	    }
	    
   
	    public double total() {
	        double unitTotalPrice = 0;
	        double finalAmountToPay=0;	        
	        for (Product product : productList) {
	        	unitTotalPrice = product.getProductPrice()*product.getProductCount();
	        	if(product.getProductType()==ItemType.OTHER) {
	        		finalAmountToPay+=discountService.calculateDiscount(unitTotalPrice, user);
	        	}else {
	        		finalAmountToPay=finalAmountToPay+unitTotalPrice;
	        	}
	        }
	        if(finalAmountToPay>100) {
	        	finalAmountToPay=discountService.extraDiscountOnBill(finalAmountToPay);
	        }
	        return finalAmountToPay;
	    }
	 
}
