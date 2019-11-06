/**
 * 
 */
package com.srk.EventOrganizer.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author shaishab
 *
 */
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Document(collection = "event")
public class Event {

	@Id
	private String id;

	@Field(value = "eventName")
	private String eventName;

	@Field(value = "eventDescription")
	private String eventDescription;

	public Event() {
		// no-arg
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Event(String id, String eventName, String eventDescription) {
		this.eventName = eventName;
		this.eventDescription = eventDescription;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventName=" + eventName + ", eventDescription=" + eventDescription + "]";
	}

}
