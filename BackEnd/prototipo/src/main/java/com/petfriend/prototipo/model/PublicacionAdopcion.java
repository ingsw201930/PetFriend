package com.petfriend.prototipo.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "PUBLICACIONANIMAL")
public class PublicacionAdopcion extends PublicacionAnimal {
	@Column(name="ENCONTRADO")
	private boolean encontrado;

	public boolean isEncontrado() {
		return encontrado;
	}
	
	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}
	
	public PublicacionAdopcion() {
	}
	
}
