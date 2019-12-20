package com.example.demo.exceptions;

public class GeneroNoValidoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public GeneroNoValidoException() {
		super("Genero ingresado no valido");
	}

}
