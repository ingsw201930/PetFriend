package com.petfriend.prototipo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_publicacion", 
  discriminatorType = DiscriminatorType.INTEGER)
public class Publicacion {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "FECHA")
    private Date fecha;//TODO
    @ManyToOne
    @JoinColumn(name="ID_DUENIO", nullable=false)
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