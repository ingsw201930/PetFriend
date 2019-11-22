package com.petfriend.prototipo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Type;

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
    @Column(name = "IMAGEN_1")
    @Type(type="text")
    private String imagen1;
    @Column(name = "IMAGEN_2")
    @Type(type="text")
    private String imagen2;
    @Column(name = "IMAGEN_3")
    @Type(type="text")
    private String imagen3;
    @Column(name = "IMAGEN_4")
    @Type(type="text")
    private String imagen4;
    @Column(name = "LOCALIDADPUBLICACION")
    private String localidad;//TODO
    @OneToMany(mappedBy = "usuario2")
    @JsonIgnore
    private List<ConversacionUsuarioUsuario> conversacionesUsuario;
    
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

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }

    public String getImagen4() {
        return imagen4;
    }

    public void setImagen4(String imagen4) {
        this.imagen4 = imagen4;
    }
    
    
}