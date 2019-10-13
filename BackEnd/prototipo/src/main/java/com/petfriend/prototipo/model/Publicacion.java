package com.petfriend.prototipo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Publicacion {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "FECHA")
    private Date fecha;//TODO
    @ManyToOne
    private Usuario duenho;
    @Column(name = "DESCRIPCION")
    private String descripcion; //TODO
    //TODO --- foto

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
    
}