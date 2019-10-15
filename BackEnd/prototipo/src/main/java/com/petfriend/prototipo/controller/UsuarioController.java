package com.petfriend.prototipo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.model.Utils;

@Controller
public class UsuarioController {
	@Autowired
	private IUsuarioRepositorio usuarioRepo;
	@Autowired
	private IPublicacionAdopcionRepositorio<PublicacionAdopcion> adopRepo;

	@GetMapping("/test")
	public void test() {
		Usuario u = new Usuario("correo@gmail.com", "larecontra", new File("prototipo/pasaporte.jpg"));
		usuarioRepo.save(u);

		Usuario test = usuarioRepo.findById(1).orElse(null);
		try {
			Utils.byteToImage(test.getFoto(), new File("almacenada.jpg"));
		} catch (IOException e) {
			System.out.println(e);
		}
		 //return "{\"message\": \"admin OK\"}";
	 }
	@GetMapping("/pubAnimal")
	public void test2() {
		Usuario u= usuarioRepo.findById(1).orElse(null);
		if(u!=null) {
			PublicacionAdopcion p=new PublicacionAdopcion();
			p.setLocalidad("Chapi");
			p.setDescripcion("bonito");
			p.setDuenho(u);
			u.pushPublicacion(p);
			adopRepo.save(p);
			usuarioRepo.save(u);
		}		
	}
	
}
