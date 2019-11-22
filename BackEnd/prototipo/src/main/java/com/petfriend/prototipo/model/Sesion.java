package com.petfriend.prototipo.model;

public class Sesion {
	private Integer id;

	private String correo;

	private Boolean status;

	public Sesion(Integer id, String correo, Boolean status) {
		this.setId(id);
		this.setCorreo(correo);
		this.setStatus(status);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}