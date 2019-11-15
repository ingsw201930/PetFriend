package com.petfriend.prototipo.model;

import java.io.File;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
    @OneToMany(mappedBy = "reporte")
    @JsonIgnore
    private List<Reporte> reportes;
    @Column(name = "FOTO")
    private byte[] foto;

    public Usuario(){
    }

    public Usuario(String correo, String contrasenha, File foto){
        this.correo = correo;
        this.contrasenha = contrasenha;
        try{
            this.foto = Utils.ImageToByte(foto);
        }catch(Exception e){
            System.out.println(e);
        }
    }

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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void pushPublicacion(Publicacion p) {
    	this.publicaciones.add(p);
    }

	public List<Reporte> getReportes() {
		return reportes;
	}

	public void setReportes(List<Reporte> reportes) {
		this.reportes = reportes;
	}
    
}