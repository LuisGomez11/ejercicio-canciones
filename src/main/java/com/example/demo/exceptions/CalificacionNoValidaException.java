package com.example.demo.exceptions;

public class CalificacionNoValidaException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CalificacionNoValidaException() {
		super("Calificación ingresada no valida");
	}

}
