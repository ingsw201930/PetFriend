package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;

@RestController
@RequestMapping("/public")
public class UsuarioPublicoRESTController {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	
	@GetMapping("/paginaPrincipal")
	public Iterable<PublicacionAdopcion> pedirPaginaPrincipal()
	{
		List<Integer> randoms = animalAdopRepo.findRandom();
		List<Integer> ids = new ArrayList<Integer>();
		List<PublicacionAdopcion> solution = new ArrayList<PublicacionAdopcion>();
		for (int i=0 ; i<10 ; ++i) {
			if(randoms.size() > i){
				ids.add(randoms.get(i));
				System.out.println(ids.get(i));
			}
		}
		for (Integer integer : ids) {
			//
		}
		return solution;
	}

	@GetMapping("/home")
	public Iterable<PublicacionAnimal> getAAdopcion()
	{
		return this.animalAdopRepo.findAll();
	}
	
}
