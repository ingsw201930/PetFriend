package com.petfriend.prototipo.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ConversacionUsuarioPublicacion extends Conversacion {
	@ManyToOne
    @JoinColumn(name="IDPUBLICACION", nullable=false)
    @JsonIgnore
    private Publicacion publicacion;

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	
}
