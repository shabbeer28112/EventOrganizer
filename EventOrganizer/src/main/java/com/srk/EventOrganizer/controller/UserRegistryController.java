/**
 * 
 */
package com.srk.EventOrganizer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srk.EventOrganizer.entity.UserRegistry;
import com.srk.EventOrganizer.service.UserRegistryService;

/**
 * @author shaishab
 *
 */
@RestController
@RequestMapping("/userRegistry")
public class UserRegistryController {

	@Autowired
	private UserRegistryService userRegistryService;

	@PostMapping
	public UserRegistry createUser(@RequestBody UserRegistry user) {
		UserRegistry createdUser = userRegistryService.createUser(user);
		return createdUser;
	}

	@PutMapping
	public UserRegistry updateUser(@RequestBody UserRegistry user) {
		UserRegistry updatedUser = userRegistryService.updateUser(user);
		return updatedUser;
	}

	@GetMapping("/{userId}")
	public Optional<UserRegistry> getUserById(@PathVariable(name = "userId") String userId) {
		Optional<UserRegistry> userDetailsById = userRegistryService.getUserDetailsById(userId);
		return userDetailsById;
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(String userId) {
		userRegistryService.deleteUserById(userId);
	}
}
