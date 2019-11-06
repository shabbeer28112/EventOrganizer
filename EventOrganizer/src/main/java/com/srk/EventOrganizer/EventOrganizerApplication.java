/**
 * 
 */
package com.srk.EventOrganizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author shaishab
 *
 */

@SpringBootApplication
@EnableMongoRepositories({"com.srk.EventOrganizer.repository"})
public class EventOrganizerApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(EventOrganizerApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(EventOrganizerApplication.class);
	}

}
