package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PublicacionAEncontrado extends PublicacionBusqueda {
	@Column(name = "LUGARENCONTRADO")
	private String lugarEncontrado;
	@Column( name = "ENCONTRADO")
	private boolean encontrado;
	
	public String getLugarEncontrado() {
		return lugarEncontrado;
	}

	public void setLugarEncontrado(String lugarEncontrado) {
		this.lugarEncontrado = lugarEncontrado;
	}

	public boolean isEncontrado() {
		return encontrado;
	}

	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}
	
}
