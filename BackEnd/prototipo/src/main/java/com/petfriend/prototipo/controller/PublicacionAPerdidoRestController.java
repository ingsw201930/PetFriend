package com.petfriend.prototipo.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petfriend.prototipo.model.PublicacionAPerdido;
import com.petfriend.prototipo.model.Usuario;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

@RestController
@RequestMapping("/APerdido")
public class PublicacionAPerdidoRestController {
	@Autowired
	private IUsuarioRepositorio usuarioRepo;
	@Autowired
	private IPublicacionAPerdidoRepositorio aPerdRepo;
	@GetMapping("/pub")
	public void test2() {
		Usuario u= usuarioRepo.findById(1).get();
		if(u!=null) {
			PublicacionAPerdido p=new PublicacionAPerdido();
			p.setLugarPerdido("Candelaria");
			p.setDescripcion("Cariñoso");
			p.setDuenho(u);
			p.setFecha(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			u.pushPublicacion(p);
			aPerdRepo.save(p);
			usuarioRepo.save(u);
		}		
	}
}
