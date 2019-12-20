package com.example.demo.shared.domain;

import com.example.demo.exceptions.CalificacionNoValidaException;

public class Calificacion {

	private final Double value;
	
	public Calificacion(Double value) {
		if(value > 5 || value < 0) {
			throw new CalificacionNoValidaException();
		}
		this.value = value;
	}
	
	public Double getValue() {
		return value;
	}
	
}
