package com.prueba.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dao.PersonDAO;
import com.prueba.models.person;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonRest {

	@Autowired
	PersonDAO personDAO;
	
	//localhost:8080/person/SavePersona
	@PostMapping("/SavePersona")
	public void GuardarPersona(@RequestBody person Person) {
		personDAO.save(Person);
	}
	
	//localhost:8080/person/GetAllPersonas
	@GetMapping("/GetAllPersonas")
	public List<person> listar() {
		return personDAO.findAll();
	}
	
	//localhost:8080/person/DeletePersonasById/1
	@DeleteMapping("/DeletePersonasById/{id}")
	public void eliminarperson(@PathVariable("id") Integer id) {
		personDAO.deleteById(id);
	}
	
	
	
	//localhost:8080/person/UpdatePersona
	@PutMapping("/UpdatePersona/{id}")
	public void UpdatePersona(@PathVariable("id")int id,@RequestBody person Person) {
		personDAO.save(Person);
	}
	
	//localhost:8080/person/GetPersonasById
	@GetMapping("/GetPersonasById/{id}")
	public Optional<person> FindPersonById(@PathVariable("id") Integer id) {
		return personDAO.findById(id);
	}
	
	
}
