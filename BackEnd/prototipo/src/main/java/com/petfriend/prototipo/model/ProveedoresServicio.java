package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class ProveedoresServicio extends Usuario {
	@Column(name = "DIRECCION")
    private String direccion;
	@Column(name = "TELEFONO")
    private String telefono;
	@Column(name = "NIT")
    private String nit;
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
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	
}
