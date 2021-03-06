package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.aplication.FacturaAplication;
import com.example.demo.domain.services.FacturaService;
import com.example.demo.infraestructura.mapper.FacturaMapper;
import com.example.demo.infraestructura.restdto.FacturaRestDto;
import com.example.demo.shared.domain.Codigo;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {

	FacturaAplication facturaAplication;
	
	public FacturaController(@Autowired FacturaService facturaService, @Autowired FacturaMapper facturaMapper) {
		this.facturaAplication = new FacturaAplication(facturaService, facturaMapper);
	}
	
	@GetMapping
	public List<FacturaRestDto> getFacturas(){
		return facturaAplication.getFacturas();
	}
	
	@GetMapping("/{codigo}")
	public FacturaRestDto getFactura(@PathVariable Codigo codigo) {
		return facturaAplication.getFactura(codigo);
	}
	
	@PostMapping
	public void save(@RequestBody FacturaRestDto factura) {
		facturaAplication.save(factura);
	}
	
}
