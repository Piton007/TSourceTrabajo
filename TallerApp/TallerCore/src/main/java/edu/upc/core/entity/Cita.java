package edu.upc.core.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cita")
public class Cita implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_cita;
	
	@ManyToOne
	@JoinColumn(name = "hvId",nullable=false)
	private H_V hvId;
	
	@Column(name = "fecha_cita")
	private int fecha_cita;
	
	@Column(name = "hora_cita")
	private int hora_cita;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "id", nullable = false)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name = "codigoAsistente",nullable=false)
	private Asistente codigoAsistente;
	
	@ManyToOne
	@JoinColumn(name = "codigoCliente",nullable=false)
	private Asistente codigoCliente;

	public Cita() {
		super();
	}

	public Cita(int cod_cita, H_V hvId, int fecha_cita, int hora_cita, Servicio servicio, Asistente codigoAsistente,
			Asistente codigoCliente) {
		super();
		this.cod_cita = cod_cita;
		this.hvId = hvId;
		this.fecha_cita = fecha_cita;
		this.hora_cita = hora_cita;
		this.servicio = servicio;
		this.codigoAsistente = codigoAsistente;
		this.codigoCliente = codigoCliente;
	}

	public int getCod_cita() {
		return cod_cita;
	}

	public void setCod_cita(int cod_cita) {
		this.cod_cita = cod_cita;
	}

	public H_V getHvId() {
		return hvId;
	}

	public void setHvId(H_V hvId) {
		this.hvId = hvId;
	}

	public int getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(int fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public int getHora_cita() {
		return hora_cita;
	}

	public void setHora_cita(int hora_cita) {
		this.hora_cita = hora_cita;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Asistente getCodigoAsistente() {
		return codigoAsistente;
	}

	public void setCodigoAsistente(Asistente codigoAsistente) {
		this.codigoAsistente = codigoAsistente;
	}

	public Asistente getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Asistente codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public String toString() {
		return "Cita [cod_cita=" + cod_cita + ", hvId=" + hvId + ", fecha_cita=" + fecha_cita + ", hora_cita="
				+ hora_cita + ", servicio=" + servicio + ", codigoAsistente=" + codigoAsistente + ", codigoCliente="
				+ codigoCliente + "]";
	}
	
	
}
