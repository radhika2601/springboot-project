package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Filght;
import com.example.demo.Repository.FilghtRepository;
import com.example.demo.service.FilghtService;
@Service
public class FilghtServiceimpl implements FilghtService {
@Autowired
private FilghtRepository filghtRepository;
@Override
public List<Filght> getAllFilght(){
	return filghtRepository.findAll();
	}
@Override
public Filght updateFilght(Filght filght) {
	Filght _filght=filghtRepository.findById(filght.getId()).get(0);
	_filght.setId(filght.getId());
	_filght.setName(filght.getName());
	_filght.setStatus(filght.getStatus());
	_filght.setTime(filght.getTime());
	
	return filghtRepository.save(_filght); 
}
@Override
public String deleteFilght(int id) {
	filghtRepository.deleteById(id);
	return "the flight with id"+id+"has been canceled";
}
@Override
public Filght saveFilght(Filght filght) {
	return filghtRepository.save(filght);
}
@Override
public Filght findByFilghtId(int filghtId) {
	return filghtRepository.findById(filghtId).get(0);
}
}
