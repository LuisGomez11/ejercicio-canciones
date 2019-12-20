package com.example.demo.shared.domain;

import com.example.demo.exceptions.DuracionNoValidaException;

public class Duracion {

private final Double value;
	
	public Duracion(Double value) {
		if(value > 60 || value < 0) {
			throw new DuracionNoValidaException();
		}
		this.value = value;
	}
	
	public Double getValue() {
		return value;
	}
	
}
