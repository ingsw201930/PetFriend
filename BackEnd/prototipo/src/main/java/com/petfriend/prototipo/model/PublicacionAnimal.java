package com.petfriend.prototipo.model;

//import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
@Inheritance(strategy = InheritanceType.JOINED)
public class PublicacionAnimal extends Publicacion {
	@OneToOne(mappedBy = "publicacion")
	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
