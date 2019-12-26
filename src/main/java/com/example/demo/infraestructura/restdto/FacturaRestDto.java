package com.example.demo.infraestructura.restdto;

import java.util.List;

import com.example.demo.infraestructura.dto.AlbumDto;
import com.example.demo.infraestructura.dto.CancionDto;

public class FacturaRestDto {

	private String codigo;
	private String comprador;
	private List<AlbumDto> albumes;
	private List<CancionDto> canciones;
	private Double valorFactura;

	public FacturaRestDto(String codigo, String comprador, List<AlbumDto> albumes, List<CancionDto> canciones,
			Double valorFactura) {
		this.codigo = codigo;
		this.comprador = comprador;
		this.albumes = albumes;
		this.canciones = canciones;
		this.valorFactura = valorFactura;
	}	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public List<AlbumDto> getAlbumes() {
		return albumes;
	}

	public void setAlbumes(List<AlbumDto> albumes) {
		this.albumes = albumes;
	}

	public List<CancionDto> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<CancionDto> canciones) {
		this.canciones = canciones;
	}

	public Double getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(Double valorFactura) {
		this.valorFactura = valorFactura;
	}
	
	
	
}
