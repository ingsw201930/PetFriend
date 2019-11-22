package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.petfriend.prototipo.model.PersonaNatural;
import com.petfriend.prototipo.model.ProveedoresServicio;
import com.petfriend.prototipo.model.Publicacion;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public")
public class UsuarioPublicoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionRepositorio<Publicacion> adopRepo;
	@Autowired
	private IUsuarioRepositorio usuarioRepo;
	
	@GetMapping("/paginaPrincipal")
	public Iterable<Publicacion> pedirPaginaPrincipal()
	{
		List<Integer> randoms = animalAdopRepo.findRandom();
		List<Integer> ids = new ArrayList<Integer>();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		System.out.println("Lo pide");
		for (int i=0 ; i<10 ; ++i) {

			if(randoms.size() > i){
				ids.add(randoms.get(i));
				System.out.println(ids.get(i));
			}
		}
		for (Integer integer : ids) {
			solution.add(this.adopRepo.findById(integer).get());
		}
		return solution;
	}
	
	@PostMapping("/registrarUsuario")
	@ResponseBody
	public String registrarUsuario(@RequestBody PersonaNatural pNatural)
	{
		System.out.println("Se intenta registrar");
		Usuario u = this.usuarioRepo.findByCorreo(pNatural.getCorreo());
		if(u != null)
			return "USUARIO EXISTENTE";
		
		this.usuarioRepo.save(pNatural);
		return "REGISTRADO";
	}
	
	@PostMapping("/registrarTienda")
	@ResponseBody
	public String registrarTienda(@RequestBody ProveedoresServicio pServicio)
	{
		Usuario u = this.usuarioRepo.findByCorreo(pServicio.getCorreo());
		if(u != null)
			return "USUARIO EXISTENTE";
		
		this.usuarioRepo.save(pServicio);
		return "REGISTRADO";
	}

	@GetMapping("/home")
	public Iterable<PublicacionAnimal> getAAdopcion()
	{
		return this.animalAdopRepo.findAll();
	}
	
}
