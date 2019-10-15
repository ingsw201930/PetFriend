package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PublicacionAPerdido extends PublicacionBusqueda {
	@Column(name = "LUGARPERDIDO")
	private String lugarPerdido;

	public String getLugarPerdido() {
		return lugarPerdido;
	}

	public void setLugarPerdido(String lugarPerdido) {
		this.lugarPerdido = lugarPerdido;
	}
	
	public PublicacionAPerdido() {
	}
	
}
