package com.petfriend.prototipo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "reportes")
public class Reporte {
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int idReporte;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private char estado;
    @Column(name = "CONCLUSION")
    private String conclusion;
    @Column(name = "FECHA")
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "ID_REPORTADO")
    @JsonIgnore
    private Usuario reporte;
    
	public int getIdReporte() {
		return idReporte;
	}
	public void setIdReporte(int idReporte) {
		this.idReporte = idReporte;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Usuario getReporte() {
		return reporte;
	}
	public void setReporte(Usuario reporte) {
		this.reporte = reporte;
	}
    
    
}
