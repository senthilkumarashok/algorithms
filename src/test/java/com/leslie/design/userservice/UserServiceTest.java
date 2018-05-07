package com.leslie.design.userservice;

import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

	
	@Before
	public void setup(){

		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void createServiceDuplicateServiceNameTest(){
		
		String userServiceName = "service1";
		
		UserServiceDriver usd = new UserServiceDriver();
		usd.createService(userServiceName);
		usd.createService(userServiceName);
	
	}
	
	
	@Test
	public void createServiceTest(){
		
		String userServiceName = "service1";
		
		UserServiceDriver usd = new UserServiceDriver();
		usd.createService(userServiceName);
	
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void addUserUnkownUserServiceTest(){
		
		UserServiceDriver usd = new UserServiceDriver();
		usd.addUser("abc", "Leslie", 1L);
		
	}
	
	
	@Test
	public void addUserTest(){
		
		String userServiceName = "service1";
		String userName = "Leslie";
		
		UserServiceDriver usd = new UserServiceDriver();
		usd.createService(userServiceName);
		usd.addUser(userServiceName, userName, 1L);
			
	}
	
	
	@Test
	public void registerServiceTest(){
		
		
	}
	
	
	@Test
	public void deRegisterServiceTest(){
		
		
	}
	
	

	

}
