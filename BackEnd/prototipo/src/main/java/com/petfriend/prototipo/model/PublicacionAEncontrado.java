package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PublicacionAEncontrado extends PublicacionBusqueda {
	@Column(name = "LUGARENCONTRADO")
	private String lugarEncontrado;
	
	public String getLugarEncontrado() {
		return lugarEncontrado;
	}

	public void setLugarEncontrado(String lugarEncontrado) {
		this.lugarEncontrado = lugarEncontrado;
	}
}
