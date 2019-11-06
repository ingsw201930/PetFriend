package com.petfriend.prototipo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.petfriend.prototipo.model.Publicacion;

public interface IPublicacionRepositorio<T extends Publicacion> extends CrudRepository<T, Integer> {
    
}
