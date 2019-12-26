package com.example.demo.infraestructura.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "canciones")
public class CancionDto extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String autor;
	private Double valor;
	private Double duracion;
	private String genero;
	private Double calificacion;
	
	public CancionDto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
