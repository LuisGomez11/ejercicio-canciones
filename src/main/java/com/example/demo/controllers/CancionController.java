package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.aplication.CancionAplication;
import com.example.demo.domain.services.CancionService;
import com.example.demo.infraestructura.mapper.CancionMapper;
import com.example.demo.infraestructura.restdto.CancionRestDto;
import com.example.demo.shared.domain.Codigo;

@RestController
@RequestMapping("/api/cancion")
public class CancionController {

	CancionAplication cancionAplication;
	
	public CancionController(CancionService cancionService, CancionMapper cancionMapper) {
		this.cancionAplication = new CancionAplication(cancionService, cancionMapper);
	}
	
	@GetMapping
	public List<CancionRestDto> getCanciones(){
		return cancionAplication.getCanciones();
	}
	
	@GetMapping("/{codigo}")
	public CancionRestDto getCancion(@PathVariable Codigo codigo){
		return cancionAplication.getCancion(codigo);
	}
	
	@PostMapping
	public void save(@RequestBody CancionRestDto cancion) {
		cancionAplication.save(cancion);
	}
	
	@DeleteMapping("/{codigo}")
	public void delete(@PathVariable Codigo codigo) {
		cancionAplication.delete(codigo);
	}
	
}
