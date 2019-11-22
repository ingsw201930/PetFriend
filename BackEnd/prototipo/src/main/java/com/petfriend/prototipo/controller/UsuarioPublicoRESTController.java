package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.petfriend.prototipo.model.Filtros;
import com.petfriend.prototipo.model.Publicacion;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionRepositorio;

@RestController
@RequestMapping("/public")
public class UsuarioPublicoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionRepositorio<Publicacion> adopRepo;
	@Autowired
    private PublicacionAnimalController controlPub;
	
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

	
	@GetMapping("/Adopcion")
	public Iterable<Publicacion> pedirAAdopcion()
	{
		return this.controlPub.pedirPublicacionesAdopcion();
	}

	@GetMapping("/Busqueda/Adopcion/Avanzada")
	public Iterable<Publicacion> pedirAAdopcionFiltros(@RequestBody Filtros filtros)
	{
		/*System.out.println("");
		System.out.println("");
		System.out.println("entra master");
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");*/
		return this.controlPub.pedirPublicacionesAdopcionFiltros(filtros);
	}

	@GetMapping("/Busqueda/Perdido/Avanzada")
	public Iterable<Publicacion> pedirAPerdidoFiltros(@RequestBody Filtros filtros)
	{
		/*System.out.println("");
		System.out.println("");
		System.out.println("entra master");
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");*/
		return this.controlPub.pedirPublicacionesPerdidoFiltros(filtros);
	}

	@GetMapping("/Busqueda/Encontrado/Avanzada")
	public Iterable<Publicacion> pedirAEncontradoFiltros(@RequestBody Filtros filtros)
	{
		/*System.out.println("");
		System.out.println("");
		System.out.println("entra master");
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");*/
		return this.controlPub.pedirPublicacionesEncontradoFiltros(filtros);
	}

	@GetMapping("/home")
	public Iterable<PublicacionAnimal> getAAdopcion()
	{
		return this.animalAdopRepo.findAll();
	}
	
}
