package com.petfriend.prototipo.rest;

import java.util.List;

import com.petfriend.prototipo.model.Person;
import com.petfriend.prototipo.repository.IPersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/personas")
public class RestPersonController {

	@Autowired
	private IPersonRepo repo;
	
	@GetMapping
	public List<Person> listar(){
		return repo.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Person per){
		repo.save(per);
	}
	
	@PutMapping
	public void modificar(@RequestBody Person per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
