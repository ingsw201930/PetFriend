package com.petfriend.prototipo.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ConversacionUsuarioUsuario extends Conversacion {

    @ManyToOne
    @JoinColumn(name="IDUSUARIO2", nullable=false)
    @JsonIgnore
    private Usuario usuario2;

	public Usuario getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}
    
}
