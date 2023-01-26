package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Passenger_info")

public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	@NotNull(message="please enter name")
	private String name;
	@NotNull(message="please enter Gender")
	private String gender;
	@Email(message="please enter email")
	private String email;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int id, @NotNull(message = "please enter name") String name,
			@NotNull(message = "please enter Gender") String gender,
			@Email(message = "please enter email") String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}
