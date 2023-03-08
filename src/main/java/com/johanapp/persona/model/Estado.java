package com.johanapp.persona.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {

	private int id;
	private String nombre;
	
	
	public Estado(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
