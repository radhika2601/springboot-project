package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Filght;

public interface FilghtRepository extends JpaRepository<Filght,Integer> {
//find filght using id
	List<Filght>findById(int id);

}
