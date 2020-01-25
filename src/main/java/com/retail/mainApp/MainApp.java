package com.retail.mainApp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.retails.cart.ProductCart;
import com.retails.constants.ItemType;
import com.retails.constants.UserType;
import com.retails.model.Product;
import com.retails.model.User;
import com.retails.service.DiscountService;
import com.retails.serviceImpl.DiscountServiceImpl;

public class MainApp {
	
	public static void main(String args[]) throws Exception {
		
	
		User user=new User(UserType.EMPLOYEE, "james", "989898989", "Delhi",true);
		
		Product p1=new Product("apple", 100, ItemType.GROCERY, 21, 2);
		Product p2=new Product("jeans", 1000, ItemType.OTHER, 212, 1);
		
		List<Product> productList=new LinkedList<Product>();
		productList.add(p1);
		productList.add(p2);		
		ProductCart cart=new ProductCart(user, productList);		
		double pay=cart.total();
		System.out.println(pay);	
		
	}

}
