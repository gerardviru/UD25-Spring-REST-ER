package UD25.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "almacen")
public class Almacenes {

	// Atributos de entidad almacenes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "lugar") // no hace falta si se llama igual
	private String lugar;
	@Column(name = "capacidad") // no hace falta si se llama igual
	private Integer capacidad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Cajas> cajas;

	// Constructor Default
	public Almacenes() {

	}

	// Constructor
	public Almacenes(Long id, String lugar, Integer capacidad) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	// Getters & Setters


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}
	

	/**
	 * @return the cajas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajas")
	public List<Cajas> getCajas() {
		return cajas;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + cajas + "]";
	}

}
