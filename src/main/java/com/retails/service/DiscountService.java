package com.retails.service;

import com.retails.model.User;

/*
 * discount service to calculate the discount
 */
public interface DiscountService {
	
	double calculateDiscount(double totalAmount,User user);
	double extraDiscountOnBill(double totalAmount);

}
