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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
@Table(name="Revision")
public class Revision implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="Detalle_Revision",length=100)
	private String Detalle;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="Revision_Repuesto",joinColumns = {@JoinColumn(name="fk_Revision")}
	,inverseJoinColumns = {@JoinColumn(name="fk_Repuesto")})
	private List<Repuesto>Repuestos= new ArrayList<>();
	
	@OneToOne(mappedBy = "revision",cascade = CascadeType.ALL)
	private Servicio servicio;
	
	
	
	public Revision() {
		
	}
	public Revision(int id, String detalle, List<Repuesto> repuestos,Servicio servicio) {
		
		Id = id;
		Detalle = detalle;
		Repuestos = repuestos;
		this.servicio=servicio;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	public List<Repuesto> getRepuestos() {
		return Repuestos;
	}
	public void setRepuestos(List<Repuesto> repuestos) {
		Repuestos = repuestos;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
}
