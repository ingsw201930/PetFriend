package com.petfriend.prototipo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Animal implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @OneToOne
    private PublicacionAnimal publicacion;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ESPECIE")
    private String especie;
    @Column(name = "RAZA")
    private String raza;
    @Column(name = "COLOR")
    private Character color;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "ESTERILIZADO")
    private Boolean esterilizado;
    @Column(name = "FECHA")
    private Date fecha;//TODO
    //TODO --- fotos

}
