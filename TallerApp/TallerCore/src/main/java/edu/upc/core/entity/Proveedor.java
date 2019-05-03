package edu.upc.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="Proveedor")
public class Proveedor implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="RUC")
	private long RUC;
	
	@Column(name="Tipo",length = 20)
	private String Tipo;
	
	@Column(name="Ciudad",length = 20)
	private String Ciudad;
	
	@Column(name="Telefono")
	private long Telefono;
	
	@Column(name="Confiabilidad")
	private int Confiabilidad;

	@OneToMany(mappedBy="proveedor",cascade=CascadeType.ALL,fetch =FetchType.LAZY)
	private List<Repuesto>repuestos= new ArrayList<>();
	
	public Proveedor() {
		
		// TODO Auto-generated constructor stub
	}


	


	public Proveedor(int id, long rUC, String tipo, String ciudad, long telefono, int confiabilidad,
			List<Repuesto> repuestos) {
		Id = id;
		RUC = rUC;
		Tipo = tipo;
		Ciudad = ciudad;
		Telefono = telefono;
		Confiabilidad = confiabilidad;
		this.repuestos = repuestos;
	}





	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public long getRUC() {
		return RUC;
	}


	public void setRUC(long rUC) {
		RUC = rUC;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	public String getCiudad() {
		return Ciudad;
	}


	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}


	public long getTelefono() {
		return Telefono;
	}


	public void setTelefono(long telefono) {
		Telefono = telefono;
	}


	public int getConfiabilidad() {
		return Confiabilidad;
	}


	public void setConfiabilidad(int confiabilidad) {
		Confiabilidad = confiabilidad;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	public List<Repuesto> getRepuestos() {
		return repuestos;
	}





	public void setRepuestos(List<Repuesto> repuestos) {
		this.repuestos = repuestos;
	}
	
	
	
	
}
