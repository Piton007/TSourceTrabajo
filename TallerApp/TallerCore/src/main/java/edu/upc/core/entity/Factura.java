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
@Table(name="factura")
public class Factura implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoFactura;
	
	@Column(name = "fecha")
	private int fecha;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente",nullable=false)
	private Cliente codCliente;
	
	@Column(name = "Placa")
	private String Placa;
	
	@ManyToOne
	@JoinColumn(name = "cod_asistentee",nullable=false)
	private Asistente codAsistente;
	
	@ManyToOne
	@JoinColumn(name = "cod_tipoPago",nullable=false)
	private TipoPago codTipoPago;
	
	public Factura() {
	}

	public Factura(int codigoFactura, int fecha, Cliente codCliente, String placa, Asistente codAsistente,
			TipoPago codTipoPago) {
		super();
		this.codigoFactura = codigoFactura;
		this.fecha = fecha;
		this.codCliente = codCliente;
		this.Placa = placa;
		this.codAsistente = codAsistente;
		this.codTipoPago = codTipoPago;
	}

	public int getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(int codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public Cliente getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Cliente codCliente) {
		this.codCliente = codCliente;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public Asistente getCodAsistente() {
		return codAsistente;
	}

	public void setCodAsistente(Asistente codAsistente) {
		this.codAsistente = codAsistente;
	}

	public TipoPago getCodTipoPago() {
		return codTipoPago;
	}

	public void setCodTipoPago(TipoPago codTipoPago) {
		this.codTipoPago = codTipoPago;
	}

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", fecha=" + fecha + ", codCliente=" + codCliente
				+ ", Placa=" + Placa + ", codAsistente=" + codAsistente + ", codTipoPago=" + codTipoPago + "]";
	}
	
	
	
	

}
