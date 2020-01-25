package com.retail.test;

import org.junit.Before;   
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import com.retails.cart.ProductCart;
import com.retails.constants.ItemType;
import com.retails.constants.UserType;
import com.retails.model.Product;
import com.retails.model.User;

/*
 * Test Cases for no discount policy
 */
public class TestDiscounts {
	 private Product groceryItem;
	    private Product otherItem;
	    private User employee;
	    private User affiliate;
	    private User simpleUser;
	    private User simpleUserWith2Years;
	    private List<Product> productList;
	    
	    @Before
	    public void setUp() {
	    	productList=new ArrayList<Product>();
	    	employee =new User(UserType.EMPLOYEE, "james", "989898989", "Delhi",false);
	    	affiliate = new User(UserType.AFFILIATE, "james", "989898989", "Delhi",false);
	    	simpleUser = new User(UserType.SIMPLE, "james", "989898989", "Delhi",false);
	    	simpleUserWith2Years= new User(UserType.SIMPLE, "james", "989898989", "Delhi",true);
	    	groceryItem=new Product("apple", 80, ItemType.GROCERY, 21, 1);
	    	otherItem=new Product("books", 1000, ItemType.OTHER, 212, 1);    
	    	
	    }
	    
	    
	    @Test
	    public void test_employeeWithGrocery() {
	    	productList.add(groceryItem);
	        ProductCart cart = new ProductCart(employee, productList);
	        // No discount because of grocery item
	        assertEquals(80, cart.total(), 0.01);
	       
	    }
	    
	    @Test
	    public void test_employeeWithOtherItem() {
	    	productList.add(otherItem);
	        ProductCart cart = new ProductCart(employee, productList);
	        /*
	         *  30% discount then 5 dollars off of each 100 dollars of total price because of other item
	         *  Total 1000
	         *  After 30% discount =700
	         *  After 35 dollars off due to price  700 = 665
	         */
	        assertEquals(665, cart.total(), 0.01);
	        	    }
	    
	    @Test
	    public void test_AffliateWithOtherItem() {
	    	productList.add(otherItem);
	        ProductCart cart = new ProductCart(affiliate, productList);
	        /*
	         *  30% discount then 5 dollars off of each 100 dollars of total price because of other item
	         *  Total 1000
	         *  After 10% discount =900
	         *  After 45 dollars off due to price  700 = 855
	         */
	        assertEquals(855, cart.total(), 0.01);
	        	    }
	    
	    @Test
	    public void test_AffliateWithGroceryItem() {
	    	productList.add(groceryItem);
	    	productList.add(otherItem);
	        ProductCart cart = new ProductCart(affiliate, productList);
	        /*
	         *  10% discount then 5 dollars off of each 100 dollars of total price because of other item
	         *  
	         *  After 10% discount on grocery =900
	         *  Total 900+80=980
	         *  After 45 dollars off due to price  900 = 935
	         */
	        
	        assertEquals(935, cart.total(), 0.01);
	        	    }
	    
	    @Test
	    public void test_simpleUserWithOtherItem() {
	    	productList.add(otherItem);
	    	productList.add(groceryItem);
	        ProductCart cart = new ProductCart(simpleUser, productList);
	        /*
	         *  Total 1000+80=1080
	         *  After 50 dollars off due to price over 1000 = 1030
	         */
	        assertEquals(1030, cart.total(), 0.01);
	    }
	    
	    
	    @Test
	    public void test_simpleUserWith2Years() {
	    	productList.add(otherItem);
	    	productList.add(groceryItem);
	        ProductCart cart = new ProductCart(simpleUserWith2Years, productList);
	        /*
	         *  5% discount on other 1000=950
	         *  Total 950+80=1030
	         *  After 50 dollars off due to price over 1000 = 980
	         */
	        assertEquals(980, cart.total(), 0.01);
	    }
}

