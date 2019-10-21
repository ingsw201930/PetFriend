package com.petfriend.prototipo.model;

//import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
public class PublicacionBusqueda extends PublicacionAnimal {
    @Column(name = "ULTIMO_MOMENTO_VISTO")
    private Date ultimoEncuentro;

	public PublicacionBusqueda() {
	}
	
}