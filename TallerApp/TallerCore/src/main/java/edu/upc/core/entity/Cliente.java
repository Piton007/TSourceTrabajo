package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="cliente")
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int codigoCliente;
	
	@Column(name = "DNI", length = 8, nullable = false)
	private String  DNI;
	
	@Column(name = "Nombre", length = 50, nullable = false)
	private String Nombre;
	
	@Column(name = "Ciudad", length = 80, nullable = false)
	private String Ciudad ;
	
	@Column(name = "Telefono", length = 9, nullable = false)
	private long Telefono;
	
	public Cliente() {
	}

	public Cliente(int codigoCliente, String dNI, String nombre, String ciudad, int telefono) {
	
		this.codigoCliente = codigoCliente;
		this.DNI = dNI;
		this.Nombre = nombre;
		this.Ciudad = ciudad;
		this.Telefono = telefono;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
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

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", DNI=" + DNI + ", Nombre=" + Nombre + ", Ciudad=" + Ciudad
				+ ", Telefono=" + Telefono + "]";
	}
	
	
	
	
	

}
