package com.petfriend.prototipo.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pubAni")
public class PublicacionAdopcion extends PublicacionAnimal {
	@Column(name="LOCALIDAD")
	private String localidad;

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public PublicacionAdopcion() {
	}
	
}
