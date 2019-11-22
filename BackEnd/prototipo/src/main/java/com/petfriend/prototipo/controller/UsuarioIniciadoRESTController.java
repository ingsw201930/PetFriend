package com.petfriend.prototipo.controller;

import com.petfriend.prototipo.model.PublicacionAEncontrado;
import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;

//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioIniciadoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionAPerdidoRepositorio animalPerdRepo;
	@Autowired
	private IPublicacionAEncontradoRepositorio animalEncRepo;
	@Autowired
	private ConstructorPublicacion constructorPub;

	@PostMapping("{id}/publicacionAAdopcion")
	public PublicacionAdopcion crearPAAdopcion(@PathVariable int id,@RequestBody PublicacionAdopcion pAnimal)
	{

		return constructorPub.crearPAAdopcion(id, pAnimal);
	}

	@GetMapping("{id}/Perfil")
	public PublicacionAnimal obtenerPerfilUsuario(@PathVariable int idP)
	{
		return this.animalAdopRepo.findById(idP).get();
	}

	@GetMapping("{id}/publicacionAAdopcion/{idP}")
	public PublicacionAnimal obtenerPAAdopcion(@PathVariable int idP)
	{
		return this.animalAdopRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAPerdido")
	public PublicacionAPerdido crearPAPerdido(@PathVariable int id,@RequestBody PublicacionAPerdido pAnimal)
	{
		return constructorPub.crearPAPerdido(id, pAnimal);
	}
	
	@GetMapping("{id}/publicacionAPerdio/{idP}")
	public PublicacionAnimal obtenerPAPerdido(@PathVariable int idP)
	{
		return this.animalPerdRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAEncontrado")
	public PublicacionAEncontrado crearPAEncontrado(@PathVariable int id,@RequestBody PublicacionAEncontrado pAnimal)
	{
		return constructorPub.crearPAEncontrado(id, pAnimal);
	}
	
	@GetMapping("{id}/publicacionAEncontrado/{idP}")
	public PublicacionAnimal obtenerPAEncontrado(@PathVariable int idP)
	{
		return this.animalEncRepo.findById(idP).get();
	}
}