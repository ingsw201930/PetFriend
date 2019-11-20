package com.petfriend.prototipo.model;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.persistence.PrimaryKeyJoinColumn;
@Entity
//@PrimaryKeyJoinColumn(name = "pubI")
@Table(name = "publicaciones_servicio")
public class PublicacionServicio extends Publicacion {

	public PublicacionServicio() {
	}	
}
