package com.petfriend.prototipo.controller;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.petfriend.prototipo.model.Animal;
import com.petfriend.prototipo.model.PublicacionAEncontrado;
import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.repositories.IAnimalRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class FactoriaPublicacion {
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> animalAdopRepo;
	@Autowired
	private IPublicacionAPerdidoRepositorio animalPerdRepo;
	@Autowired
	private IPublicacionAEncontradoRepositorio animalEncRepo;
	@Autowired
	private IUsuarioRepositorio usuarioRepo;
	@Autowired
	private IAnimalRepositorio animalRepo;

	private static EntityManagerFactory emf = new Persistence().createEntityManagerFactory("com.PetFriend");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public PublicacionAdopcion crearPAAdopcion(Integer id, PublicacionAdopcion pAnimal)
	{
		EntityManager em = getEntityManager();
		/* while(em.find(Usuario.class, id.intValue()) == null){
			em.getTransaction().begin();

			em.persist(new Usuario("user@petfriend.com", "contra", new File("pasaporte.jpg")));

			em.getTransaction().commit();
		}
		System.out.println();
		Usuario u = em.find(Usuario.class, id); */
		Usuario u= usuarioRepo.findById(id).get();
		System.out.println(u);
		PublicacionAdopcion aux = null;
		if(u!=null) {
			PublicacionAdopcion p=new PublicacionAdopcion();
			
			p.setLocalidad(pAnimal.getLocalidad());
			p.setDescripcion(pAnimal.getDescripcion());
			p.setImagen1(pAnimal.getImagen1());
			p.setImagen2(pAnimal.getImagen2());
			p.setImagen3(pAnimal.getImagen3());
			p.setImagen4(pAnimal.getImagen4());
			p.setDuenho(u);
			
			//u.pushPublicacion(p);
			Animal a= new Animal();
			a.setNombre(pAnimal.getAnimal().getNombre());
			a.setEspecie(pAnimal.getAnimal().getEspecie());
			a.setRaza(pAnimal.getAnimal().getRaza());
			a.setColor1(pAnimal.getAnimal().getColor1());
			a.setColor2(pAnimal.getAnimal().getColor2());
			a.setSexo(pAnimal.getAnimal().getSexo());
			a.setEsterilizado(pAnimal.getAnimal().getEsterilizado());

			System.out.println("HOLA");
			p.setAnimal(a);
			aux = p;
			em.getTransaction().begin();
			
			em.persist(a);
			em.persist(p);

			em.getTransaction().commit();
		}	
		return aux;
	}
	
	public PublicacionAPerdido crearPAPerdido(int id, PublicacionAPerdido pAnimal)
	{
		Usuario u= usuarioRepo.findById(id).get();
		PublicacionAPerdido aux=null;
		if(u!=null) {
			PublicacionAPerdido p=new PublicacionAPerdido();
			p.setLocalidad(pAnimal.getLocalidad());
			p.setDescripcion(pAnimal.getDescripcion());
			p.setImagen1(pAnimal.getImagen1());
			p.setImagen2(pAnimal.getImagen2());
			p.setImagen3(pAnimal.getImagen3());
			p.setImagen4(pAnimal.getImagen4());
			p.setDuenho(u);
			//u.pushPublicacion(p);
			Animal a= new Animal(pAnimal.getAnimal().getNombre(),
								 pAnimal.getAnimal().getEspecie(),
								 pAnimal.getAnimal().getRaza(),
								 pAnimal.getAnimal().getColor1(),
								 pAnimal.getAnimal().getColor2(),
								 pAnimal.getAnimal().getSexo(),
								 pAnimal.getAnimal().getEsterilizado());
			aux=this.animalPerdRepo.save(p);
			animalRepo.save(a);
		}	
		return aux;
	}

	public PublicacionAEncontrado crearPAEncontrado(int id, PublicacionAEncontrado pAnimal)
	{
		Usuario u= usuarioRepo.findById(id).get();
		PublicacionAEncontrado aux=null;
		if(u!=null) {
			PublicacionAEncontrado p=new PublicacionAEncontrado();
			p.setLocalidad(pAnimal.getLocalidad());
			p.setDescripcion(pAnimal.getDescripcion());
			p.setImagen1(pAnimal.getImagen1());
			p.setImagen2(pAnimal.getImagen2());
			p.setImagen3(pAnimal.getImagen3());
			p.setImagen4(pAnimal.getImagen4());
			p.setDuenho(u);
			//u.pushPublicacion(p);
			Animal a= new Animal();
			a.setNombre(pAnimal.getAnimal().getNombre());
			a.setEspecie(pAnimal.getAnimal().getEspecie());
			a.setRaza(pAnimal.getAnimal().getRaza());
			a.setColor1(pAnimal.getAnimal().getColor1());
			a.setColor2(pAnimal.getAnimal().getColor2());
			a.setSexo(pAnimal.getAnimal().getSexo());
			a.setEsterilizado(pAnimal.getAnimal().getEsterilizado());

			aux=this.animalEncRepo.save(p);
			animalRepo.save(a);
		}	
		return aux;
	}
}