package com.petfriend.prototipo.repositories;

import org.springframework.data.repository.CrudRepository;


import com.petfriend.prototipo.model.Animal;

public interface IAnimalRepositorio extends CrudRepository<Animal, Integer> {
}
