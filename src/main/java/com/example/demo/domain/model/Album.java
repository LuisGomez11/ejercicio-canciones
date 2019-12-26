package com.example.demo.domain.model;

import java.util.List;

import com.example.demo.shared.domain.Codigo;
import com.example.demo.shared.domain.Nombre;
import com.example.demo.shared.domain.Valor;

public class Album {

	private final Codigo codigo;
	private final Nombre titulo;
	private final Valor valorTotal;
	private final List<Cancion> canciones;
	
	public static Album of(Codigo codigo, Nombre titulo, Valor valorTotal, List<Cancion> canciones) {
		return new Album(codigo, titulo, valorTotal, canciones);
	}
	
	public Album(Codigo codigo, Nombre titulo, Valor valorTotal, List<Cancion> canciones) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.valorTotal = valorTotal;
		this.canciones = canciones;
	}

	public Codigo getCodigo() {
		return codigo;
	}

	public Nombre getTitulo() {
		return titulo;
	}

	public Valor getValorTotal() {
		return valorTotal;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}
	
	
	
	
}
