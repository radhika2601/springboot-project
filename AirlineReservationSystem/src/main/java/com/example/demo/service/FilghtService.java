package com.example.demo.service;

import com.example.demo.Model.Filght;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface FilghtService {
public Filght saveFilght(Filght filght);
public Filght findByFilghtId(int FilghtId);
List<Filght>getAllFilght();
String deleteFilght(int id);
Filght updateFilght(Filght filght);
}
