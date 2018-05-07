package com.leslie.design.userservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
	
	private String serviceName;//Given
	
	private Map<Long, User> userMap;
	private Set<UserService> userServiceDependencies;
	
	
	/*
	 * Constructors
	 */
	public UserService(String serviceName) {
		super();
		this.serviceName = serviceName;
		userMap = new HashMap<>();
		userServiceDependencies = new HashSet<>();
	}

	
	/*
	 * Getters
	 */
	
	public String getServiceName() {
		return serviceName;
	}


	/*
	 * Setters
	 */
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	/*
	 * To Implement
	 */
	
	public void addUser(User user){
		
		User existingUser = userMap.get(user.getId());
		
		if (existingUser != null && existingUser.getName().equals(user.getName()) ){
			LOGGER.info("User with ID: '{}', and name '{}' already exists. Nothing to do", user.getId(), user.getName());
		}
		else if (existingUser != null){
			System.out.println("User with ID '" + user.getId() + "' already exists. Updating user name");
			LOGGER.info("User with ID: '{}' already exists. Updating user name from '{}' to '{}'", user.getId(), existingUser.getName(), user.getName());
			existingUser.setName(user.getName());
			addUserToSubscriptions(user);
		}
		else{
			LOGGER.info("Adding new user with ID: '{}', and name: '{}'", user.getId(), user.getName());
			userMap.put(user.getId(), user);
			addUserToSubscriptions(user);
		}	
	
	}
	

	public void registerService(UserService dependentUserService){
		
		if(!userServiceDependencies.add(dependentUserService)){
			LOGGER.info("UserService with name '{}' already registered with user service with name '{}'. Nothing to do ",
					dependentUserService.getServiceName(), serviceName);
		}
		else{
			LOGGER.info("Successfully registered UserService with name '{}' with user service with name '{}'", 
					dependentUserService.getServiceName(), serviceName);
		}

	}
	
	
	public void deRegisterService(UserService dependentUserService){
		
	}
	
	
	public void deleteUser(User user){
		
	}
	
	
	public void printUsers(){
		
		LOGGER.info("Printing all users of service with name '{}':", serviceName);
		userMap.entrySet().forEach(System.out::println);
		userMap.entrySet().forEach(u -> LOGGER.info(u.toString()));
		
	}
	
	
	/*
	 * Private Methods
	 */
	private void addUserToSubscriptions(User user){
		
		List<String> affectedServiceNames = new ArrayList<>();
		affectedServiceNames.add(serviceName);
		
		for(UserService sub : userServiceDependencies){
			
			if(affectedServiceNames.contains(sub)) continue;
			sub.addUser(user);
			//TODO
	
		}

	}
	
	
	private void removeUserFromSubscriptions(User user){
		//TODO
	}
	

}
