package com.example.demo.repotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.example.demo.Model.Passenger;
import com.example.demo.Repository.PassengerRepository;
import com.example.demo.service.PassengerService;

@SpringBootTest
public class PassengerRepositoryTest {
@MockBean
private PassengerRepository passengerRepository;
@Autowired
private PassengerService passengerservice;
//Test for add new passenger
@Test
void testsavePassenger() {
	Passenger p=new Passenger(1,"riya","female","r@gmail.com");
	Mockito.when(passengerRepository.save(p)).thenReturn(p);
	assertEquals(p,passengerservice.savePassenger(p));
}
//Test GetAllPassenger Method
@Test
void testGetAllPassenger() {
	List<Passenger> passenger = Stream
			.of(new Passenger(1,"ravti","female","r@gamil.com"),
					new Passenger(2,"Shiv","male","s@gamil.com"))
			.collect(Collectors.toList());
	Mockito.when(passengerRepository.findAll()).thenReturn(passenger);
	assertEquals(2,passengerservice.getAllPassenger().size());
	
	}
//Test DeletePassenger Method
		@Test
		void testDeletePassenger() 
		{
			passengerservice.deletePassenger(1);
			Mockito.verify(passengerRepository).deleteById(1);
		}
	
}
