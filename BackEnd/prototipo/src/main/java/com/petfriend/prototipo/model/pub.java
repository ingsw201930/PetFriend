package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class pub extends Publicacion {
	@Column(name = "LUGAR")
	String lugar;

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}
