package com.petfriend.prototipo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Animal implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private int idAnimal;
    @OneToOne
    private PublicacionAnimal publicacion;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ESPECIE")
    private String especie;
    @Column(name = "RAZA")
    private String raza;
    @Column(name = "COLOR")
    private Character color;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "ESTERILIZADO")
    private Boolean esterilizado;
    @Column(name = "FECHA")
    private Date fecha;//TODO
    //TODO --- fotos
    
	
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
	public Character getColor() {
		return color;
	}
	public void setColor(Character color) {
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
