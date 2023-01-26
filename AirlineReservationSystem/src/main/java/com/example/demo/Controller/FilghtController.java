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

import com.example.demo.Model.Filght;

import com.example.demo.service.FilghtService;
@RestController
public class FilghtController {
	@Autowired
	public FilghtService filghtservice;//creating filght variable 
	@PostMapping(value="/filght")
	public ResponseEntity<Filght> addController(@Valid @RequestBody Filght filght) {
		return new ResponseEntity<Filght>(filghtservice.saveFilght(filght),HttpStatus.CREATED);
		//return filghtservice.saveFilght(filght);
	}//get all filght data
	@GetMapping(value="/filght")
	public List<Filght> getAllController(){
		return filghtservice.getAllFilght();
	}//put mapping for update filght data
	@PutMapping(value="/filght")
	public Filght updateController(@RequestBody Filght filght) {
		return filghtservice.updateFilght(filght);
	}//delete data
	@DeleteMapping(value="/filght/{id}")
	public String deleteController(@PathVariable int id) {
		return filghtservice.deleteFilght(id);
	}
	//@GetMapping(value="/passenger/id/{id}")
	//public Filght findById(@PathVariable int id){
	//	return filghtservice.findByFilghtId(id);
	//}
}


























