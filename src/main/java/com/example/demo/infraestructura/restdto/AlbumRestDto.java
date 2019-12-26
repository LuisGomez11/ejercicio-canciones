package com.example.demo.infraestructura.restdto;

import java.util.List;

import com.example.demo.infraestructura.dto.CancionDto;

public class AlbumRestDto {

	private String codigo;
	private String titulo;
	private Double valorTotal;
	private List<CancionDto> canciones;
	
	public AlbumRestDto(String codigo, String titulo, Double valorTotal, List<CancionDto> canciones) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.valorTotal = valorTotal;
		this.canciones = canciones;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
