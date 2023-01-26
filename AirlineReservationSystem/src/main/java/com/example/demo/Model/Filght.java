package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
// for table creation
@Entity
@Table(name="Filght_info")// for table name
public class Filght {
	@Id//for primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//auto generation id
private int id;
	@NotNull(message= "please enter name")// for validation
	private String name;
	@NotNull(message="please enter status")// for required field
	private String status;
	private int time;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Passenger>passengerList=new ArrayList<>();
	//constructor
	public Filght() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor using fields
	public Filght(int id, @NotNull(message = "please enter name") String name,
			@NotNull(message = "please enter status") String status, int time, List<Passenger> passengerList) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.time = time;
		this.passengerList = passengerList;
	}
	//getter&setter
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	
}
