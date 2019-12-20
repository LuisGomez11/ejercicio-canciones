package com.example.demo.shared.domain;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.demo.exceptions.GeneroNoValidoException;

public class Genero {
	private final String value;

	public Genero(String value) {
		ArrayList<String> generos = new ArrayList<String>(Arrays.asList("Bachata", "Baladas", "Blues", "Bolero", "Bosa Nova",
				"Celta", "Clásica", "Corrido", "Country", "Criollo", "Cumbia", "Dancehall", "Disco", "Dubstep", "Electrónica",
				"Flamenco", "Folk", "Funk", "Gospel", "Heavy Metal", "Hip Hop", "Indie", "Jazz", "Merengue", "Polka",
				"Pop", "Punk", "Ranchera", "Rap", "Reggae", "Reggaeton", "Rumba", "Rhythm and Blues", "Rock",
				"Rock and Roll", "Salsa", "Samba", "Ska", "Son", "Soul", "Swing", "Tango", "Trap", "Trova", "Vals",
				"Vallenato","Champeta"));
		generos.stream().forEach(genero -> genero.toUpperCase());
		this.value = generos.stream().filter(genero -> genero.matches(value)).findAny()
				.orElseThrow(() -> new GeneroNoValidoException());

	}

	public String getValue() {
		return value;
	}
}
