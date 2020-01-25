package com.retail.main;

import java.util.LinkedList;
import java.util.List;

import com.retails.cart.ProductCart;
import com.retails.constants.ItemType;
import com.retails.constants.UserType;
import com.retails.model.Product;
import com.retails.model.User;

/*
 * If you want to run the application , you can run it from MainApp class
 * result will be printed on console
 */
public class MainApp {
	
	
	public static void main(String... args)  {	
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
