package com.petfriend.prototipo.model;

//import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
public class PublicacionAnimal extends Publicacion {
	@OneToOne
	private Animal animalAsociado;
	
	public Animal getAnimal() {
		return animalAsociado;
	}
	
	public void setAnimal(Animal animal) {
		this.animalAsociado = animal;
	}

	public PublicacionAnimal() {
	}
}
