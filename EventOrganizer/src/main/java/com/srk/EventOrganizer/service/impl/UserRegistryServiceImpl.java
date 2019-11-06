/**
 * 
 */
package com.srk.EventOrganizer.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srk.EventOrganizer.entity.UserRegistry;
import com.srk.EventOrganizer.repository.UserRegistryRepository;
import com.srk.EventOrganizer.service.UserRegistryService;

/**
 * @author shaishab
 *
 */
@Service
public class UserRegistryServiceImpl implements UserRegistryService {

	@Autowired
	private UserRegistryRepository userRegistryRepo;
	
	/*
	 * create a new user
	 */
	@Override
	public UserRegistry createUser(UserRegistry user) {
		// TODO Auto-generated method stub
		return userRegistryRepo.save(user);
	}

	/*
	 * Update an existing user 
	 */
	@Override
	public UserRegistry updateUser(UserRegistry user) {
		// TODO Auto-generated method stub
		return userRegistryRepo.save(user);
	}

	/*
	 * Get an existing user by userId 
	 */
	@Override
	public Optional<UserRegistry> getUserDetailsById(String userId) {
		// TODO Auto-generated method stub
		return userRegistryRepo.findById(userId);
	}

	/*
	 * Delete an existing user by userId
	 */
	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub
		userRegistryRepo.deleteById(userId);
	}

}
