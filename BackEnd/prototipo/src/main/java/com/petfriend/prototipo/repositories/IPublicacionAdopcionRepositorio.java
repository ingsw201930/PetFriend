package com.petfriend.prototipo.repositories;

import java.util.List;

import com.petfriend.prototipo.model.PublicacionAdopcion;

import org.springframework.data.jpa.repository.Query;

public interface IPublicacionAdopcionRepositorio<T extends PublicacionAdopcion> extends IPublicacionAAnimalRepositorio<PublicacionAdopcion> {
    @Query("SELECT ID FROM PUBLICACION_ADOPCION ORDER BY RANDOM() LIMIT 10")
    List<Integer> findRandom();
}
