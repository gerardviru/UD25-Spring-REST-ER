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
	@Column (name= "num_ref")
	private String num_ref;
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

	public Cajas(String num_ref, String contenido, Integer valor, Almacenes almacenes) {
		this.num_ref = num_ref;
		this.contenido = contenido;
		this.valor = valor;
		this.almacenes = almacenes;

	}

	// Getters y Setters

	public String getNum_ref() {
		return num_ref;
	}

	public void setNum_ref(String num_ref) {
		this.num_ref = num_ref;
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
		return "Cajas [num_ref=" + num_ref + ", contenido=" + contenido + ", valor=" + valor + ", almacenes="
				+ almacenes + "]";
	}

	
}
