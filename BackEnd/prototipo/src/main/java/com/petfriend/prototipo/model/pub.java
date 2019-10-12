package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
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
