package com.petfriend.prototipo.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "PUBLICACIONANIMAL")
public class PublicacionAdopcion extends PublicacionAnimal {
	@Column(name="ADOPTADO")
	private boolean adoptado;

	public boolean isAdoptado() {
		return adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	public PublicacionAdopcion() {
	}
	
}
