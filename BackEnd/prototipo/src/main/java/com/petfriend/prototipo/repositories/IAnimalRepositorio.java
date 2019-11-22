package com.petfriend.prototipo.repositories;

import org.springframework.data.repository.CrudRepository;


import com.petfriend.prototipo.model.Animal;
import com.petfriend.prototipo.model.PublicacionAnimal;

public interface IAnimalRepositorio extends CrudRepository<Animal, Integer> {
    
    Iterable<Animal> findAllByEspecie(String especie);
}
