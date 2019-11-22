package com.petfriend.prototipo.controller;

import com.petfriend.prototipo.model.Administrador;
import com.petfriend.prototipo.model.PersonaNatural;
import com.petfriend.prototipo.model.ProveedoresServicio;
import com.petfriend.prototipo.model.PublicacionAEncontrado;
import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.Refugio;
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
	private ConstructorPublicacion constructorPub;

	@GetMapping
	@RequestMapping({ "/validateLogin" })
	@ResponseBody
	public String validateLogin(@RequestParam(defaultValue = "correo") String correo, @RequestParam(defaultValue = "pass") String pass) {
		System.out.println("ENTRA");
		Usuario u = this.usuarioRepo.findByCorreo(correo);
		if(u == null)
			return null;
		if(!u.getContrasenha().equals(pass))
			return null;
		if(u instanceof Administrador)
			return "ADMIN";
		if(u instanceof PersonaNatural)
			return "USUARIO";
		if(u instanceof ProveedoresServicio)
			return "TIENDA";
		if(u instanceof Refugio)
			return "USUARIO";
		return null;
	}

	@GetMapping
	@RequestMapping({ "/getId" })
	public String getId(@RequestBody String correo) {
		Usuario u = this.usuarioRepo.findByCorreo(correo);
		if(u == null)
		return null;
		System.out.println(u.getIdUsuario());
		return "" + u.getIdUsuario();
	}
	
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