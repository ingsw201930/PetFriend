package com.petfriend.prototipo.model;

//import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
@Table(name = "publicaciones_animal")
public class PublicacionAnimal extends Publicacion {
	@Cascade({CascadeType.SAVE_UPDATE})
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
