package com.example.demo.domain.model;

import java.util.List;

import com.example.demo.shared.domain.Codigo;
import com.example.demo.shared.domain.Nombre;
import com.example.demo.shared.domain.Valor;

public class Factura {

	private final Codigo codigo;
	private final Nombre comprador;
	private final List<Cancion> canciones;
	private final List<Album> albumes;
	private final Valor valorFactura;
	
	public static Factura of(Codigo codigo, Nombre comprador, List<Cancion> canciones, List<Album> albumes, Valor valorFactura) {
		return new Factura(codigo, comprador, canciones, albumes, valorFactura);
	}
	
	public Factura(Codigo codigo, Nombre comprador, List<Cancion> canciones, List<Album> albumes, Valor valorFactura) {
		this.codigo = codigo;
		this.comprador = comprador;
		this.canciones = canciones;
		this.albumes = albumes;
		this.valorFactura = valorFactura;
	}
	
	

	public Codigo getCodigo() {
		return codigo;
	}

	public Nombre getComprador() {
		return comprador;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public List<Album> getAlbumes() {
		return albumes;
	}

	public Valor getValorFactura() {
		return valorFactura;
	}
	
	
	
}
