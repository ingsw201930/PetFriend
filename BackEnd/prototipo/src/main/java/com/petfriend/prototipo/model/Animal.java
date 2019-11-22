package com.petfriend.prototipo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Animal implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int idAnimal;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ESPECIE")
    private String especie;
    @Column(name = "RAZA")
    private String raza;
    @Column(name = "COLOR_PRINCIPAL")
    private String color1;
    @Column(name = "COLOR_SECUNDARIO")
    private String color2;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "ESTERILIZADO")
	private Boolean esterilizado;
	
    //TODO --- fotos
    
    public Animal(String nombre, String especie, String raza, String color1, String color2,
			Character sexo, Boolean esterilizado) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.color1 = color1;
		this.color2 = color2;
		this.sexo = sexo;
		this.esterilizado = esterilizado;
	}
	public Animal(Animal n) {
		super();
		this.nombre = n.nombre;
		this.especie = n.especie;
		this.raza = n.raza;
		this.color1 = n.color1;
		this.color2 = n.color2;
		this.sexo = n.sexo;
		this.esterilizado = n.esterilizado;
	}

	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
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
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor1() {
		return color1;
	}
	public void setColor1(String color) {
		this.color1 = color;
	}
	public String getColor2() {
		return color2;
	}
	public void setColor2(String color) {
		this.color2 = color;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Boolean getEsterilizado() {
		return esterilizado;
	}
	public void setEsterilizado(Boolean esterilizado) {
		this.esterilizado = esterilizado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Animal() {
		
	}
}
