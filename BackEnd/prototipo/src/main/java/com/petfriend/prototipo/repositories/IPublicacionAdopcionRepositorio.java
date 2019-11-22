package com.petfriend.prototipo.repositories;

import java.util.List;

import com.petfriend.prototipo.model.PublicacionAdopcion;

import org.springframework.data.jpa.repository.Query;

public interface IPublicacionAdopcionRepositorio<T extends PublicacionAdopcion> extends IPublicacionAAnimalRepositorio<PublicacionAdopcion> {
    @Query(value = "SELECT publicacionanimal FROM publicacion_adopcion ORDER BY RANDOM()", nativeQuery = true)
    public List<Integer> findRandom();
}
