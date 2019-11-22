package com.petfriend.prototipo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Mensaje {
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "DESCRIPCION")
	private String descripcion;
    @Column(name = "FECHAENVIO")
	private Date fecha;
    @Column(name = "RECIBIDO")
	private boolean recibido;
    @ManyToOne
    @JsonIgnore
    private Conversacion conversacion;
    
}
