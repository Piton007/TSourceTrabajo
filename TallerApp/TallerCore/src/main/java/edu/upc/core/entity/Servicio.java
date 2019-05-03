package edu.upc.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
@Table(name = "Servicio")
public class Servicio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="Fecha_Servicio")
	private LocalDate fecha;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Revision")
	private Revision revision;
	
	public Servicio() {
		
	}

	public Servicio(int id, LocalDate fecha, Revision revision) {
		super();
		Id = id;
		this.fecha = fecha;
		this.revision = revision;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Revision getRevision() {
		return revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/*private List<Tecnico>tecnicos;*/
	
}
