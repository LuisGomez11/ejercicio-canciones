package com.example.demo.infraestructura.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "albumes")
public class AlbumDto extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private Double valorTotal;
	@OneToMany(targetEntity = CancionDto.class, cascade = CascadeType.ALL)
	private List<CancionDto> canciones;
	
	public AlbumDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<CancionDto> getCanciones() {
		return canciones;
	}
	public void setCanciones(List<CancionDto> canciones) {
		this.canciones = canciones;
	}

	
	
}
