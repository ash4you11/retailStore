package com.retails.model;

import java.util.Date;

import com.retails.constants.UserType;

/*
 * User Class to store information about user 
 */
public class User {
	
	private  UserType type;
    private  String userName;
    private  Date joiningDate;
    private String mobileNmber;
    private String city;
    private boolean isUserTwoYearsAssociation;
  
	public User(UserType type, String userName, String mobileNmber, String city,boolean isUserTwoYearsAssociation) {
		super();
		this.type = type;
		this.userName = userName;
		this.mobileNmber = mobileNmber;
		this.city = city;
		this.isUserTwoYearsAssociation=isUserTwoYearsAssociation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getMobileNmber() {
		return mobileNmber;
	}
	public void setMobileNmber(String mobileNmber) {
		this.mobileNmber = mobileNmber;
	}
	public boolean isUserTwoYearsAssociation() {
		return isUserTwoYearsAssociation;
	}
	public void setUserTwoYearsAssociation(boolean isUserTwoYearsAssociation) {
		this.isUserTwoYearsAssociation = isUserTwoYearsAssociation;
	}
    
	
    
    

}
