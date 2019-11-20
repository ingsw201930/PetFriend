package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "personas_naturales")
public class PersonaNatural extends Usuario {
	@Column(name = "DIRECCION")
    private String direccion;
	@Column(name = "TELEFONO")
    private String telefono;
	@Column(name = "CALIFICACION")
	private int calificacion;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
}
