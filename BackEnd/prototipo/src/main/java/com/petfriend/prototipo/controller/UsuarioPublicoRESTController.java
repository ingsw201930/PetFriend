package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;

@RestController
@RequestMapping("/public")
public class UsuarioPublicoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	
	@GetMapping("/home")
	public Iterable<PublicacionAnimal> getAAdopcion()
	{
		return this.animalAdopRepo.findAll();
	}
	
}
