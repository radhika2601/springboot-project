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

import com.example.demo.Model.Filght;
import com.example.demo.Model.Passenger;
import com.example.demo.Repository.FilghtRepository;
import com.example.demo.service.FilghtService;

@SpringBootTest
public class FilghtRepositoryTest {
@MockBean
private FilghtRepository filghtRepository;
@Autowired
private FilghtService filghtService;
@Test
void testaddFilght() {

	List<Passenger> Passengerlist=Stream
	.of(new Passenger(1,"deep","male","de@gamil.com"),new Passenger(2,"shree","male","sh@gmil.com")).collect(Collectors.toList());
	
	Filght f=new Filght(1,"indigo","delay",8, Passengerlist);
	Mockito.when(filghtRepository.save(f)).thenReturn(f);
	assertEquals(f,filghtService.saveFilght(f));
}
@Test
void testGetAllFilght() {
	List<Passenger> passengerlist=Stream
			.of(new Passenger(1,"deep","male","de@gmail"),new Passenger(2,"shree","male","sh@gmail.com")).collect(Collectors.toList());
	List<Passenger> passengerlist1=Stream
			.of(new Passenger(3,"sanvi","female","sa@gamil.com"),
					new Passenger(4,"sanu","male","S@gmail.com"))
			
					.collect(Collectors.toList());
	
	
	List<Filght> filght= Stream
			.of(new Filght(1,"spice jet","Landing",6,passengerlist),
			new Filght(2,"Airindia","Landing",6,passengerlist1))
			.collect(Collectors.toList());
	Mockito.when(filghtRepository.findAll()).thenReturn(filght);
	assertEquals(2,filghtService.getAllFilght().size());
	
	}
//Test DeletePassenger Method
		@Test
		void testDeletePassenger() 
		{
			filghtService.deleteFilght(1);
			Mockito.verify(filghtRepository).deleteById(1);
		}
}



















