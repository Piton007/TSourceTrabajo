package edu.upc.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hv")
public class H_V implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHV;
	
	@ManyToOne
	@OneToMany(mappedBy = "hvId", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Detalle_HV> details;

	@ManyToOne
	@JoinColumn(name = "num_placa", nullable = false)
	private Vehiculo num_placa;

	public H_V() {
		super();
	}

	public H_V(int idHV, List<Detalle_HV> details, Vehiculo num_placa) {
		super();
		this.idHV = idHV;
		this.details = details;
		this.num_placa = num_placa;
	}

	public int getIdHV() {
		return idHV;
	}

	public void setIdHV(int idHV) {
		this.idHV = idHV;
	}

	public List<Detalle_HV> getDetails() {
		return details;
	}

	public void setDetails(List<Detalle_HV> details) {
		this.details = details;
	}

	public Vehiculo getNum_placa() {
		return num_placa;
	}

	public void setNum_placa(Vehiculo num_placa) {
		this.num_placa = num_placa;
	}
	
	
	
}
