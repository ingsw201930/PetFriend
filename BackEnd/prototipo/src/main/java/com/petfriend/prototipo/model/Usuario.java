package com.petfriend.prototipo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int idUsuario;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "CONTRASENHA")
    private String contrasenha;
    @OneToMany(mappedBy = "duenho")
    @JsonIgnore
    private List<Publicacion> publicaciones;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    public void pushPublicacion(Publicacion p) {
    	this.publicaciones.add(p);
    }
}