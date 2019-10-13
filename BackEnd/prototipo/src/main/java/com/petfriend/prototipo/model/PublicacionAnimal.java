package com.petfriend.prototipo.model;

//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pubID")
public class PublicacionAnimal extends Publicacion {
	@ManyToOne
	private Animal animalAsociado;

	public Animal getAnimalAsociado() {
		return animalAsociado;
	}

	public void setAnimalAsociado(Animal animalAsociado) {
		this.animalAsociado = animalAsociado;
	}

}
