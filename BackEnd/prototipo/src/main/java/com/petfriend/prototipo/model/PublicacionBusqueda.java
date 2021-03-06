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
	@Column( name = "ENCONTRADO")
	private boolean encontrado;

	public PublicacionBusqueda() {
	}

	public boolean isEncontrado() {
		return encontrado;
	}

	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}
	
}
