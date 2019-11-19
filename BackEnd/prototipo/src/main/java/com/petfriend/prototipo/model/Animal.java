package com.petfriend.prototipo.model;

import java.io.Serializable;
import java.sql.Date;

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
    @Column(name = "COLOR")
    private String color;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "ESTERILIZADO")
    private Boolean esterilizado;
    @Column(name = "FECHA")
    private Date fecha;//TODO
    @OneToOne
    @JsonIgnore
    private PublicacionAnimal publicacion;
    //TODO --- fotos
    
    public Animal(PublicacionAnimal publicacion, String nombre, String especie, String raza, String color,
			Character sexo, Boolean esterilizado) {
		super();
		this.publicacion = publicacion;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.color = color;
		this.sexo = sexo;
		this.esterilizado = esterilizado;
	}
	public Animal(Animal n) {
		super();
		this.nombre = n.nombre;
		this.especie = n.especie;
		this.raza = n.raza;
		this.color = n.color;
		this.sexo = n.sexo;
		this.esterilizado = n.esterilizado;
		this.fecha = n.fecha;
	}

	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
		
	public PublicacionAnimal getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(PublicacionAnimal publicacion) {
		this.publicacion = publicacion;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Animal() {
		
	}
}
