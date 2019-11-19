package com.petfriend.prototipo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public /*abstract*/ class Publicacion {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "FECHACREACION")
    private Date fecha;//TODO
    @ManyToOne
    @JoinColumn(name="ID_DUENIO", nullable=false)
    @JsonIgnore
    private Usuario duenho;
    @Column(name = "DESCRIPCION")
    private String descripcion; //TODO
    //TODO --- foto
    @Column(name = "LOCALIDADPUBLICACION")
    private String localidad;//TODO
    
    public Publicacion()
    {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getDuenho() {
        return duenho;
    }

    public void setDuenho(Usuario duenho) {
        this.duenho = duenho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
    
    
}