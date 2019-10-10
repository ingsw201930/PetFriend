package com.petfriend.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petfriend.prototipo.model.Person;;

public interface IPersonRepo extends JpaRepository<Person, Integer>{
	
}