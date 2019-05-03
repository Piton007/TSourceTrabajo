package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalleHV")
public class Detalle_HV implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numHV;
	
	@ManyToOne
	@JoinColumn(name = "hvId",nullable=false)
	private H_V hvId;

	@ManyToOne
	@JoinColumn(name = "codServicio",nullable=false)
	private Servicio codServicio;

	public Detalle_HV() {
		super();
	}
	public Detalle_HV(int numHV, H_V hvId, Servicio codServicio) {
		super();
		this.numHV = numHV;
		this.hvId = hvId;
		this.codServicio = codServicio;
	}
	public int getNumHV() {
		return numHV;
	}
	public void setNumHV(int numHV) {
		this.numHV = numHV;
	}
	public H_V getHvId() {
		return hvId;
	}
	public void setHvId(H_V hvId) {
		this.hvId = hvId;
	}
	public Servicio getCodServicio() {
		return codServicio;
	}
	public void setCodServicio(Servicio codServicio) {
		this.codServicio = codServicio;
	}
	@Override
	public String toString() {
		return "Detalle_HV [numHV=" + numHV + ", hvId=" + hvId + ", codServicio=" + codServicio + "]";
	}
	
	
}
