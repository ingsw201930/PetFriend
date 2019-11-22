package com.petfriend.prototipo.model;

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

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Conversacion {
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @OneToMany(mappedBy = "conversacion")
    @JsonIgnore
    private List<Mensaje> mensajes;
    @ManyToOne
    @JoinColumn(name="IDUSUARIO1", nullable=false)
    @JsonIgnore
    private Usuario usuario1;
	public List<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	public Usuario getUsuario1() {
		return usuario1;
	}
	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
    
}
