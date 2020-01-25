package com.retails.service.impl;

import com.retails.constants.UserType; 
import com.retails.model.User;
import com.retails.service.DiscountService;

/*
 * discount service implementation to calculate the discount
 */
public class DiscountServiceImpl implements DiscountService {


	public double calculateDiscount(double totalAmount, User user) {
		
		if(user.getType()==UserType.AFFILIATE) {
			return totalAmount-(totalAmount*(.1));
		}
		else if(user.getType()==UserType.EMPLOYEE) {
			return totalAmount-(totalAmount*(.3));
		}
		
		else if(user.getType()==UserType.SIMPLE && user.isUserTwoYearsAssociation()) {
			return totalAmount-(totalAmount*(.05));
		}
		//there will be no discount 
		else {
			return totalAmount;
		}
		
	} 

	public double extraDiscountOnBill(double totalAmount) {
		int discountCounter = (int) totalAmount / 100;
		double discount =(double) discountCounter * 5;
		return totalAmount - discount; 
	}


	}


