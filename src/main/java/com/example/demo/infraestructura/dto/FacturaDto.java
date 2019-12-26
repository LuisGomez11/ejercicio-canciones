package com.example.demo.infraestructura.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class FacturaDto extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private String comprador;
	
	@OneToMany(targetEntity = CancionDto.class, cascade = CascadeType.ALL)
	private List<CancionDto> canciones;
	
	@OneToMany(targetEntity = AlbumDto.class, cascade = CascadeType.ALL)
	private List<AlbumDto> albumes;
	
	private Double valorFactura;
	
	public FacturaDto() {}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public List<CancionDto> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<CancionDto> canciones) {
		this.canciones = canciones;
	}

	public List<AlbumDto> getAlbumes() {
		return albumes;
	}

	public void setAlbumes(List<AlbumDto> albumes) {
		this.albumes = albumes;
	}

	public Double getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(Double valorFactura) {
		this.valorFactura = valorFactura;
	}
	
	

}
