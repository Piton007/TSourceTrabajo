package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Asistente")

public class Asistente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int codigoAsistente;
	
	@Column(name ="Nombre",length=80,nullable=false)
	private String Nombre;
	
	
	public Asistente() {
	
	}

	public Asistente(int codigoAsistente, String nombre) {
		super();
		this.codigoAsistente = codigoAsistente;
		Nombre = nombre;
	}

	public int getCodigoAsistente() {
		return codigoAsistente;
	}

	public void setCodigoAsistente(int codigoAsistente) {
		this.codigoAsistente = codigoAsistente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	

	@Override
	public String toString() {
		return "Asistente [codigoAsistente=" + codigoAsistente + ", Nombre=" + Nombre + "]";
	}
	
	
	



}
