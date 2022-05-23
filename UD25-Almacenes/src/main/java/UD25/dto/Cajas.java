package UD25.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajas")
public class Cajas {

	// Atributos caja

	@Id
	@Column (name= "id")
	private Long id;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private Integer valor;

	@ManyToOne
	@JoinColumn(name = "id_almacen")
	private Almacenes almacenes;

	// Constructor Default

	public Cajas() {

	}

	// Constructor

	public Cajas(Long id, String contenido, Integer valor, Almacenes almacenes) {
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacenes = almacenes;

	}

	// Getters y Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(Almacenes almacenes) {
		this.almacenes = almacenes;
	}

	@Override
	public String toString() {
		return "Cajas [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacenes=" + almacenes + "]";
	}

}
