package com.petfriend.prototipo.controller;

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
import org.springframework.web.bind.annotation.RestController;

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

	public PublicacionAdopcion crearPAAdopcion(Integer id, PublicacionAdopcion pAnimal)
	{
		Usuario u = usuarioRepo.findById(id).get();
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
			Animal a= new Animal(p,
								 pAnimal.getAnimal().getNombre(),
								 pAnimal.getAnimal().getEspecie(),
								 pAnimal.getAnimal().getRaza(),
								 pAnimal.getAnimal().getColor1(),
								 pAnimal.getAnimal().getColor2(),
								 pAnimal.getAnimal().getSexo(),
								 pAnimal.getAnimal().getEsterilizado());
			aux=this.animalAdopRepo.save(p);
			animalRepo.save(a);
			//usuarioRepo.save(u);
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
			Animal a= new Animal(p,pAnimal.getAnimal().getNombre(),
								 pAnimal.getAnimal().getEspecie(),
								 pAnimal.getAnimal().getRaza(),
								 pAnimal.getAnimal().getColor1(),
								 pAnimal.getAnimal().getColor2(),
								 pAnimal.getAnimal().getSexo(),
								 pAnimal.getAnimal().getEsterilizado());
			aux=this.animalPerdRepo.save(p);
			animalRepo.save(a);
			//usuarioRepo.save(u);
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
			Animal a= new Animal(p, pAnimal.getAnimal().getNombre(),
								 pAnimal.getAnimal().getEspecie(),
								 pAnimal.getAnimal().getRaza(),
								 pAnimal.getAnimal().getColor1(),
								 pAnimal.getAnimal().getColor2(),
								 pAnimal.getAnimal().getSexo(),
								 pAnimal.getAnimal().getEsterilizado());
			aux=this.animalEncRepo.save(p);
			animalRepo.save(a);
			//usuarioRepo.save(u);
		}	
		return aux;
	}
}