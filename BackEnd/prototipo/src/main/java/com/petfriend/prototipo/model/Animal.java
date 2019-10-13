package com.petfriend.prototipo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Animal {
	@Id
	@GeneratedValue
	@Column( name= "idAnimal")
	private int id;
	@Column( name= "nombreAnimal")
	private String nombre;
	@Column( name= "especie")
	private String especie;
	@OneToMany(mappedBy="animalAsociado")
	private List<PublicacionAnimal> publicacionesAnimal;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public List<PublicacionAnimal> getPublicacionesAnimal() {
		return publicacionesAnimal;
	}
	public void setPublicacionesAnimal(List<PublicacionAnimal> publicacionesAnimal) {
		this.publicacionesAnimal = publicacionesAnimal;
	}
	
}
