package com.example.demo.exceptions;

public class DuracionNoValidaException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DuracionNoValidaException() {
		super("Duración ingresada no valida");
	}

}
