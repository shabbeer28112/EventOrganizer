package com.srk.EventOrganizer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.srk.EventOrganizer.entity.UserRegistry;

@Repository
public interface UserRegistryRepository extends MongoRepository<UserRegistry, String>{

}
