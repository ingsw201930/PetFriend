package com.petfriend.prototipo.controller;

import java.util.List;

import com.petfriend.prototipo.model.Animal;
import com.petfriend.prototipo.model.PublicacionAEncontrado;
import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.repositories.IAnimalRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

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
	private IUsuarioRepositorio usuarioRepo;
	@Autowired
	private IAnimalRepositorio animalRepo;
	
	@GetMapping("/paginaPrincipal")
	public Iterable<Integer> pedirPaginaPrincipal()
	{
		List<Integer> ids = animalAdopRepo.findRandom();
		for (Integer integer : ids) {
			System.out.println(integer);
		}
		return ids;
	}

	@PostMapping("{id}/publicacionAAdopcion")
	public PublicacionAdopcion crearPAAdopcion(@PathVariable int id,@RequestBody PublicacionAdopcion pAnimal)
	{
		Usuario u= usuarioRepo.findById(id).get();
		PublicacionAdopcion aux=null;
		System.out.println("entra");
		if(u!=null) {
			PublicacionAdopcion p=new PublicacionAdopcion();
			
			System.out.println("entra7" +pAnimal.getLocalidad());

			p.setLocalidad(pAnimal.getLocalidad());
			p.setDescripcion(pAnimal.getDescripcion());
			p.setImagen1(pAnimal.getImagen1());
			p.setImagen2(pAnimal.getImagen2());
			p.setImagen3(pAnimal.getImagen3());
			p.setImagen4(pAnimal.getImagen4());
			p.setDuenho(u);
			
			System.out.println("entra2"+pAnimal.getAnimal().getNombre());
			//u.pushPublicacion(p);
			Animal a= new Animal(p,
								 pAnimal.getAnimal().getNombre(),
								 pAnimal.getAnimal().getEspecie(),
								 pAnimal.getAnimal().getRaza(),
								 pAnimal.getAnimal().getColor1(),
								 pAnimal.getAnimal().getColor2(),
								 pAnimal.getAnimal().getSexo(),
								 pAnimal.getAnimal().getEsterilizado());
								 
			System.out.println("entra3");

			aux=this.animalAdopRepo.save(p);
			animalRepo.save(a);
			//usuarioRepo.save(u);
		}	
		return aux;
	}
	
	@GetMapping("{id}/publicacionAAdopcion/{idP}")
	public PublicacionAnimal obtenerPAAdopcion(@PathVariable int idP)
	{
		return this.animalAdopRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAPerdido")
	public PublicacionAPerdido crearPAPerdio(@PathVariable int id,@RequestBody PublicacionAPerdido pAnimal)
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
	
	@GetMapping("{id}/publicacionAPerdio/{idP}")
	public PublicacionAnimal obtenerPAPerdio(@PathVariable int idP)
	{
		return this.animalPerdRepo.findById(idP).get();
	}
	
	@PostMapping("{id}/publicacionAEncontrado")
	public PublicacionAEncontrado crearPAEncontrado(@PathVariable int id,@RequestBody PublicacionAEncontrado pAnimal)
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
	
	@GetMapping("{id}/publicacionAEncontrado/{idP}")
	public PublicacionAnimal obtenerPAEncontrado(@PathVariable int idP)
	{
		return this.animalEncRepo.findById(idP).get();
	}
}
/**
 *
 *{
    "descripcion": "bonito4",
    "localidad": "Chapi4",
    "animal": {
        "nombre": "mickey",
        "especie": "gato",
        "raza": "persa",
        "color": "Gris",
        "sexo": "M",
        "esterilizado": true
    }
} 
*/