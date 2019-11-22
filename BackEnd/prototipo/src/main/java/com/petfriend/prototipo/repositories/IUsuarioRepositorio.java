package com.petfriend.prototipo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.petfriend.prototipo.model.Usuario;

public interface IUsuarioRepositorio extends CrudRepository <Usuario, Integer> {

    Usuario findByCorreo(String correo);
}
