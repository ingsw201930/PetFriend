package com.petfriend.prototipo.controller;

import java.util.ArrayList;
import java.util.List;

import com.petfriend.prototipo.model.Publicacion;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.repositories.IAnimalRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionRepositorio;
import com.petfriend.prototipo.repositories.IUsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class PublicacionAnimalController {

    @Autowired
    private IPublicacionRepositorio<Publicacion> pubRepo;
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
    

    public Iterable<Publicacion> pedirPublicacionesAdopcion() {
        Iterable<PublicacionAnimal> aux = animalAdopRepo.findAll();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		for (PublicacionAnimal a : aux) {
			solution.add(this.pubRepo.findById(a.getId()).get());
		}
        return solution;
    }
}