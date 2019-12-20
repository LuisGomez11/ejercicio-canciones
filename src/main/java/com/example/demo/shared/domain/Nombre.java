package com.example.demo.shared.domain;

import com.example.demo.exceptions.NombreNoValidoException;

public class Nombre {
	
	private final String value;

	public Nombre(String nombre) {
		try {
			this.value = nombre;
			if (!nombre.matches("[A-Z].*")) {
				throw new NombreNoValidoException();

			}
		} catch (NullPointerException e) {
			throw new NombreNoValidoException();
		}
	}

	public String getValue() {
		return value;
	}
	
	
}
