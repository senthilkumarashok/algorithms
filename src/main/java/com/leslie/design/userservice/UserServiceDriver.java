package com.leslie.design.userservice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserServiceDriver {

	

	Map<String, UserService> serviceMap;
	
	
	/*
	 * Constructors
	 */
	public UserServiceDriver(){
		
		serviceMap = new HashMap<>();
		
	}
	
	
	
	/*
	 * Public Methods
	 */
	
	public void createService(String userServiceName){
		
		if(serviceMap.containsKey(userServiceName)){
			throw new IllegalArgumentException("UserService with name '" + userServiceName + "' already exist");
		}
		
		serviceMap.put(userServiceName, new UserService(userServiceName));
		
	}
	
	
	public void addUser(String userServiceName, String userName, Long id){
		
		UserService us = validateServiceName(userServiceName);
		
		Set<String> affectedUserServicesSet = new HashSet<>();
		affectedUserServicesSet.add(us.getServiceName());
		
		//Add user to user service
		us.addUser(new User(userName, id));
		
		//Add user to user service subscriptions
		
		
		
		
	}
	
	
	public void registerService(String userServiceName1, String userServiceName2){
		
		UserService us1 = validateServiceName(userServiceName1);
		UserService us2 = validateServiceName(userServiceName2);
		
		
			
	}
	
	
	/*
	 * Private Methods
	 */
	
	private UserService validateServiceName(String userServiceName){
		
		UserService us = serviceMap.get(userServiceName);
		
		if(us == null){
			throw new IllegalArgumentException("UserService with name '" + userServiceName + "' doesn't exist");
		}

		return us;
		
	}
	
	
}
