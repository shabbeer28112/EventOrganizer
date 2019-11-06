/**
 * 
 */
package com.srk.EventOrganizer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.srk.EventOrganizer.entity.Event;

/**
 * @author shaishab
 *
 */
@Repository
public interface EventRepository extends MongoRepository<Event, String> {

}
