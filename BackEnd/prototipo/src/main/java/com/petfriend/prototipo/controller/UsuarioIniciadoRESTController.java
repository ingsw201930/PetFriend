package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.PublicacionAEncontrado;
import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;

@RestController
@RequestMapping("/usuario")
public class UsuarioIniciadoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionAPerdidoRepositorio animalPerdRepo;
	@Autowired
	private IPublicacionAEncontradoRepositorio animalEncRepo;
	
	@PostMapping("{id}/publicacionAAdopcion")
	public PublicacionAdopcion crearPAAdopcion(@RequestBody PublicacionAdopcion pAnimal)
	{
		return this.animalAdopRepo.save(pAnimal);
	}
	
	@GetMapping("{id}/publicacionAAdopcion/{idP}")
	public PublicacionAnimal obtenerPAAdopcion(@PathVariable int idP)
	{
		return this.animalAdopRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAPerdido")
	public PublicacionAPerdido crearPAPerdio(@RequestBody PublicacionAPerdido pAnimal)
	{
		return this.animalPerdRepo.save(pAnimal);
	}
	
	@GetMapping("{id}/publicacionAPerdio/{idP}")
	public PublicacionAnimal obtenerPAPerdio(@PathVariable int idP)
	{
		return this.animalPerdRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAEncontrado")
	public PublicacionAEncontrado crearPAEncontrado(@RequestBody PublicacionAEncontrado pAnimal)
	{
		return this.animalEncRepo.save(pAnimal);
	}
	
	@GetMapping("{id}/publicacionAPerdio/{idP}")
	public PublicacionAnimal obtenerPAEncontrado(@PathVariable int idP)
	{
		return this.animalEncRepo.findById(idP).get();
	}
}
