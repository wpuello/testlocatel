package com.prueba.dao;

/**/
import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.models.person;


public interface PersonDAO extends JpaRepository<person, Integer> {
	
	
}
