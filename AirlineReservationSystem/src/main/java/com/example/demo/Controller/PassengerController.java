package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Passenger;
import com.example.demo.service.PassengerService;
@RestController
public class PassengerController {
@Autowired
PassengerService pasengerservice;//creating passenger variable
public PassengerService passengerservice;
//post passenger data
@PostMapping(value="/passenger")
public ResponseEntity<Passenger> addController(@Valid @RequestBody Passenger passenger) {
	return new ResponseEntity<Passenger>(passengerservice.savePassenger(passenger),HttpStatus.CREATED);
	//return passengerservice.savePassenger(passenger);
}
//get all passenger data
@GetMapping(value="/passenger")
public List<Passenger> getAllController(){
	return passengerservice.getAllPassenger();
}
//@GetMapping(value="/passenger/id/{id}")
//public Passenger findById(@PathVariable int id){
	//return passengerservice.findById(id);
//}
//update data
@PutMapping(value="/passenger/{id}")
public Passenger updateController(@PathVariable int id,@RequestBody Passenger passenger) {
	return passengerservice.updatePassenger(passenger,id);
}
//delete data
@DeleteMapping(value="/passenger/{id}")
public String deleteController(@PathVariable int id) {
	return passengerservice.deletePassenger(id);
}
}
