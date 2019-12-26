package com.example.demo.aplication;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.services.FacturaService;
import com.example.demo.infraestructura.mapper.FacturaMapper;
import com.example.demo.infraestructura.restdto.FacturaRestDto;

public class FacturaAplication {

	@Autowired
	FacturaService facturaService;
	
	@Autowired
	FacturaMapper facturaMapper;

	public FacturaAplication(FacturaService facturaService, FacturaMapper facturaMapper) {
		this.facturaService = facturaService;
		this.facturaMapper = facturaMapper;
	}
	
	public void save(FacturaRestDto factura) {
		if(factura.getCodigo() == null) {
			factura.setCodigo(UUID.randomUUID().toString());
		}
		facturaService.save(facturaMapper.apiConvertirDtoADomain(factura));
	}
	
	public List<FacturaRestDto> getFacturas(){
		return facturaMapper.apiConvertirListaDtoParaDominio(facturaService.findAll());
	}
	
}
