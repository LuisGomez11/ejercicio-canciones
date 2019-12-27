package com.example.demo.aplication;

import java.util.List;
import java.util.UUID;

import com.example.demo.domain.services.FacturaService;
import com.example.demo.infraestructura.mapper.FacturaMapper;
import com.example.demo.infraestructura.restdto.FacturaRestDto;
import com.example.demo.shared.domain.Codigo;

public class FacturaAplication {

	FacturaService facturaService;
	
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
		return facturaMapper.apiConvertirListaDominioParaDto(facturaService.findAll());
	}
	
	public FacturaRestDto getFactura(Codigo codigo) {
		return facturaMapper.apiConvertirDomainADto(facturaService.findById(codigo));
	}
	
}
