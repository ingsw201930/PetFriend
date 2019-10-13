package com.petfriend.prototipo.model;

//import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@PrimaryKeyJoinColumn(name = "id_publicacion")
@Inheritance(strategy = InheritanceType.JOINED)
public class PublicacionBusqueda extends Publicacion {

}
