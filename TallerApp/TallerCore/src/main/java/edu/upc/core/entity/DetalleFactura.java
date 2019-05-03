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
@Table(name ="detallefactura")
public class DetalleFactura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoDetalleFactura;
	
	@Column(name = "monto")
	private int monto;
	
	@ManyToOne
	@JoinColumn(name = "cod_factura",nullable=false)
	private Cliente codFactura;

	public DetalleFactura() {
	
	}

	public DetalleFactura(int codigoDetalleFactura, int monto, Cliente codFactura) {
		
		this.codigoDetalleFactura = codigoDetalleFactura;
		this.monto = monto;
		this.codFactura = codFactura;
	}

	public int getCodigoDetalleFactura() {
		return codigoDetalleFactura;
	}

	public void setCodigoDetalleFactura(int codigoDetalleFactura) {
		this.codigoDetalleFactura = codigoDetalleFactura;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Cliente getCodFactura() {
		return codFactura;
	}

	public void setCodFactura(Cliente codFactura) {
		this.codFactura = codFactura;
	}

	@Override
	public String toString() {
		return "DetalleFactura [codigoDetalleFactura=" + codigoDetalleFactura + ", monto=" + monto + ", codFactura="
				+ codFactura + "]";
	}
	
	
	

	
	
	
}
