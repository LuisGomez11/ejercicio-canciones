package com.example.demo.domain.model;

import com.example.demo.shared.domain.Calificacion;
import com.example.demo.shared.domain.Codigo;
import com.example.demo.shared.domain.Duracion;
import com.example.demo.shared.domain.Genero;
import com.example.demo.shared.domain.Nombre;
import com.example.demo.shared.domain.Valor;

public class Cancion {

	private final Codigo codigo;
	private final Nombre nombre;
	private final Nombre autor;
	private final Valor valor;
	private final Duracion duracion;
	private final Genero genero;
	private final Calificacion calificacion;
	
	public static Cancion of(Codigo codigo, Nombre nombre, Nombre autor, Valor valor, Duracion duracion, Genero genero,
			Calificacion calificacion) {
		return new Cancion(codigo, nombre, autor, valor, duracion, genero, calificacion);
	}
	

	private Cancion(Codigo codigo, Nombre nombre, Nombre autor, Valor valor, Duracion duracion, Genero genero,
			Calificacion calificacion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.valor = valor;
		this.duracion = duracion;
		this.genero = genero;
		this.calificacion = calificacion;
	}


	public Codigo getCodigo() {
		return codigo;
	}


	public Nombre getNombre() {
		return nombre;
	}


	public Nombre getAutor() {
		return autor;
	}


	public Valor getValor() {
		return valor;
	}


	public Duracion getDuracion() {
		return duracion;
	}


	public Genero getGenero() {
		return genero;
	}


	public Calificacion getCalificacion() {
		return calificacion;
	}

	
	
}
