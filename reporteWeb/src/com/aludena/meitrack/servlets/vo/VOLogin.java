package com.aludena.meitrack.servlets.vo;

import java.io.Serializable;

public class VOLogin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1482507939112326909L;
	private String usuario;
	private String password;
	private String nombre;
	private Integer edad;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
}
