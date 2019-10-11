package com.petfriend.prototipo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Persona")
public class Person {

	@Id
	private int idPerson;
	
	@Column(name = "nombre", columnDefinition = "VARCHAR(60) CHECK (nombre IN ('PEDRO','LUIS'))")	
	private String name;
    @Column(name = "contrasenha", length = 50)
    private String password;
    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
