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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Table(name="Repuesto")
public class Repuesto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name="Nombre_Repuesto")
	private String Nombre;
	@Column(name="Tipo_Repuesto",length=20)
	private String Tipo;
	@Column(name="Precio_Repuesto")
	private float Precio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Autor_Repuesto")
	private Proveedor proveedor;
	@ManyToMany(mappedBy = "Repuestos",cascade = CascadeType.ALL)
	private List<Revision>revisiones=new ArrayList<>();
	
	public Repuesto() {
		
	}
	
	public Repuesto(int id, String nombre, String tipo, float precio, Proveedor proveedor, List<Revision> revisiones) {
		
		Id = id;
		Nombre = nombre;
		Tipo = tipo;
		Precio = precio;
		this.proveedor = proveedor;
		this.revisiones = revisiones;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public List<Revision> getRevisiones() {
		return revisiones;
	}
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}

}
