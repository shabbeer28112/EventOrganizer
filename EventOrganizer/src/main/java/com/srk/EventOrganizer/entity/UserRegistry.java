package com.srk.EventOrganizer.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Document(collection = "userRegistrationLog")
public class UserRegistry {

	private static final Shape JsonValueFormat = null;
	@Id
	private String id;
	@Field(value = "firstName")
	private String firstName;
	@Field(value = "lastName")
	private String lastName;
	@Field(value = "gender")
	private String gender;
	@Field(value = "email")
	private String email;
	@Field(value = "password")
	private String password;
	@Field(value = "dateOfBirth")
	@JsonFormat(pattern = "dd/mm/yyyy")
	private LocalDate dateOfBirth;

	public UserRegistry() {
		// no-arg
	}

	public UserRegistry(String id, String firstName, String lastName, String gender, String email, String password,
			LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "UserRegistry [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
