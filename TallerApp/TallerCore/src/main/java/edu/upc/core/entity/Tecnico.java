package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tecnico")
public class Tecnico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codTecnico;
	
	@Column(name = "nombre", length = 80, nullable = false)
	private String nombre;

	public Tecnico() {
		super();
	}

	public Tecnico(Integer codTecnico, String nombre) {
		super();
		this.codTecnico = codTecnico;
		this.nombre = nombre;
	}

	public Integer getCodTecnico() {
		return codTecnico;
	}

	public void setCodTecnico(Integer codTecnico) {
		this.codTecnico = codTecnico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Tecnico [codTecnico=" + codTecnico + ", nombre=" + nombre + "]";
	}
	
}
