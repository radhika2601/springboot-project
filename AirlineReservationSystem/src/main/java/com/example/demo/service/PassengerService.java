package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Passenger;
@Service
public interface PassengerService {
public Passenger savePassenger(Passenger passenger);
public Passenger findById(int id);
List<Passenger>getAllPassenger();
String deletePassenger(int id);
Passenger updatePassenger(Passenger passenger ,int id);


}
