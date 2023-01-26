package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Passenger;
import com.example.demo.Repository.PassengerRepository;
import com.example.demo.service.PassengerService;
@Service
public class PassengerServiceimpl implements PassengerService{
@Autowired
public PassengerRepository passengerRepository;
@Override
public List<Passenger> getAllPassenger(){
	return passengerRepository.findAll();
	}
@Override
public Passenger updatePassenger(Passenger passenger,int id) {
	Passenger _passenger=passengerRepository.findById(id).get(id);
	_passenger.setId(passenger.getId());
	_passenger.setName(passenger.getName());
	_passenger.setGender(passenger.getGender());
	_passenger.setEmail(passenger.getEmail());
	return passengerRepository.save(_passenger);
}
@Override
public String deletePassenger(int id) {
	passengerRepository.deleteById(id);
	return "the bookwith id"+id+"has been deleted";
}
@Override
public Passenger savePassenger(Passenger passenger) {
	// TODO Auto-generated method stub
	return passengerRepository.save(passenger);
}
@Override
public Passenger findById(int id) {
	// TODO Auto-generated method stub
	return passengerRepository.findById(id).get(id);
}

}
