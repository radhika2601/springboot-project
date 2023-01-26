package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Integer>{

	//find passenger using id
		List<Passenger>findById(int id);

}
