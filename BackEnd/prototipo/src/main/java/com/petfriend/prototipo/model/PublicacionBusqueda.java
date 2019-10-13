package com.petfriend.prototipo.model;

//import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
public class PublicacionBusqueda extends PublicacionAnimal {

}
