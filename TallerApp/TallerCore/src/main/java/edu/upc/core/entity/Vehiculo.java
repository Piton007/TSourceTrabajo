package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculos")
public class Vehiculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "num_placa", length = 80, nullable = false)
	private String num_placa;
	@Column(name = "modelo", length = 80, nullable = false)
	private String modelo;
	@Column(name = "marca", length = 80, nullable = false)
	private String marca;
	@Column(name = "anio")
	private int anio;
	@Column(name = "color", length = 80, nullable = false)
	private String color;
	
	@ManyToOne
	@JoinColumn(name = "codigoCliente",nullable=false)
	private Cliente codigoCliente;
	
	@Column(name = "tipo_vehiculo", length = 80, nullable = false)
	private String tipo_vehiculo;

	
	public Vehiculo() {
		super();
	}

	public Vehiculo(Integer id, String num_placa, String modelo, String marca, int anio, String color,
			Cliente codigoCliente, String tipo_vehiculo) {
		super();
		this.id = id;
		this.num_placa = num_placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
		this.color = color;
		this.codigoCliente = codigoCliente;
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNum_placa() {
		return num_placa;
	}

	public void setNum_placa(String num_placa) {
		this.num_placa = num_placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cliente getCliente() {
		return codigoCliente;
	}

	public void setCliente(Cliente codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", num_placa=" + num_placa + ", modelo=" + modelo + ", marca=" + marca + ", anio="
				+ anio + ", color=" + color + ", codigoCliente=" + codigoCliente + ", tipo_vehiculo=" + tipo_vehiculo
				+ "]";
	}
	
	
}