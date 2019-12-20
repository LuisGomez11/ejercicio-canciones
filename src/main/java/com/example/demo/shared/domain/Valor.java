package com.example.demo.shared.domain;

import com.example.demo.exceptions.ValorNoValidoException;

public class Valor {

private final Double value;
	
	public Valor(Double value) {
		if(value < 0) {
			throw new ValorNoValidoException();
		}
		this.value = value;
	}
	
	public Double getValue() {
		return value;
	}
	
}
