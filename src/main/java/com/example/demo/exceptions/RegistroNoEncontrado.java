package com.example.demo.exceptions;

public class RegistroNoEncontrado extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public RegistroNoEncontrado() {
		super("Registro no encontrado");
	}

}
