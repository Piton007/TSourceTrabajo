package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoPago")
public class TipoPago implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoTipoPago;
	
	@Column(name="Descripcion",length =80,nullable=false)
	private String Descripcion;
	
	
	public TipoPago() {
	}
	public TipoPago(int codigoTipoPago, String descripcion) {
		this.codigoTipoPago = codigoTipoPago;
		this.Descripcion = descripcion;
	}
	public int getCodigoTipoPago() {
		return codigoTipoPago;
	}
	public void setCodigoTipoPago(int codigoTipoPago) {
		this.codigoTipoPago = codigoTipoPago;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "TipoPago [codigoTipoPago=" + codigoTipoPago + ", Descripcion=" + Descripcion + "]";
	}

	
	

}
