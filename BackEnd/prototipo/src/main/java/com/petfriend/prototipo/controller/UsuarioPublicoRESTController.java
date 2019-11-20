package com.petfriend.prototipo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

	private static EntityManagerFactory emf = new Persistence().createEntityManagerFactory("com.PetFriend");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	@GetMapping("/paginaPrincipal")
	public Iterable<Publicacion> pedirPaginaPrincipal()
	{
		EntityManager em = getEntityManager();
		List<Publicacion> prueba = em.createQuery("FROM PublicacionAdopcion ORDER BY RANDOM()").getResultList();
		System.out.println(prueba.size());
		for (Publicacion publicacion : prueba) {
			System.out.println(publicacion);
		}
		return prueba;
		/* List<Integer> randoms = animalAdopRepo.findRandom();
		List<Integer> ids = new ArrayList<Integer>();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		for (int i=0 ; i<10 ; ++i) {
			if(randoms.size() > i){
				ids.add(randoms.get(i));
				System.out.println(ids.get(i));
			}
		}
		for (Integer integer : ids) {
			solution.add(this.adopRepo.findById(integer).get());
		}
		return solution; */
	}

	@GetMapping("/home")
	public Iterable<PublicacionAnimal> getAAdopcion()
	{
		return this.animalAdopRepo.findAll();
	}
	
}
