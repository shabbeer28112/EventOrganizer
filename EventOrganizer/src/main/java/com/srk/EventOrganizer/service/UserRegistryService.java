/**
 * 
 */
package com.srk.EventOrganizer.service;

import java.util.Optional;

import com.srk.EventOrganizer.entity.UserRegistry;

/**
 * @author shaishab
 *
 */
public interface UserRegistryService {

	public UserRegistry createUser(UserRegistry user);

	public UserRegistry updateUser(UserRegistry user);

	public Optional<UserRegistry> getUserDetailsById(String userId);

	public void deleteUserById(String userId);

}
