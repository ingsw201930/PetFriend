package com.petfriend.prototipo.controller;

import com.petfriend.prototipo.model.PublicacionAEncontrado;
import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.Sesion;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/usuario"})
public class UsuarioIniciadoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionAPerdidoRepositorio animalPerdRepo;
	@Autowired
	private IUsuarioRepositorio usuarioRepo;
	@Autowired
	private IPublicacionAEncontradoRepositorio animalEncRepo;
	@Autowired
	private FactoriaPublicacion factoriaPub;

	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	@ResponseBody
	public Sesion validateLogin(@RequestParam(defaultValue = "correo") String correo) {
		Usuario u = this.usuarioRepo.findByCorreo(correo);
		System.out.println(u.getIdUsuario());
		return new Sesion(u.getIdUsuario(), correo, true);
	}
	
	@PostMapping("{id}/publicacionAAdopcion")
	public PublicacionAdopcion crearPAAdopcion(@PathVariable int id,@RequestBody PublicacionAdopcion pAnimal)
	{
		return factoriaPub.crearPAAdopcion(id, pAnimal);
	}
	
	@GetMapping("{id}/publicacionAAdopcion/{idP}")
	public PublicacionAnimal obtenerPAAdopcion(@PathVariable int idP)
	{
		return this.animalAdopRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAPerdido")
	public PublicacionAPerdido crearPAPerdido(@PathVariable int id,@RequestBody PublicacionAPerdido pAnimal)
	{
		return factoriaPub.crearPAPerdido(id, pAnimal);
	}
	
	@GetMapping("{id}/publicacionAPerdio/{idP}")
	public PublicacionAnimal obtenerPAPerdido(@PathVariable int idP)
	{
		return this.animalPerdRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAEncontrado")
	public PublicacionAEncontrado crearPAEncontrado(@PathVariable int id,@RequestBody PublicacionAEncontrado pAnimal)
	{
		return factoriaPub.crearPAEncontrado(id, pAnimal);
	}
	
	@GetMapping("{id}/publicacionAEncontrado/{idP}")
	public PublicacionAnimal obtenerPAEncontrado(@PathVariable int idP)
	{
		return this.animalEncRepo.findById(idP).get();
	}
}