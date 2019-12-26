package com.example.demo.infraestructura.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Factura;
import com.example.demo.domain.services.FacturaService;
import com.example.demo.exceptions.RegistroNoEncontrado;
import com.example.demo.infraestructura.dto.FacturaDto;
import com.example.demo.infraestructura.mapper.FacturaMapper;
import com.example.demo.infraestructura.repository.database.FacturaRepository;
import com.example.demo.shared.domain.Codigo;

@Service
public class FacturaAdapter implements FacturaService{

	@Autowired
	FacturaRepository facturaRepository;
	
	@Autowired
	FacturaMapper facturaMapper;
	
	@Override
	public List<Factura> findAll() {
		return facturaMapper.convertirListaDtoParaDominio(facturaRepository.findAll()) ;
	}

	@Override
	public Factura findById(Codigo codigo) {
		return facturaMapper.convertirDtoADomain(facturaRepository.findById(codigo.getValue()).get());
	}

	@Override
	public void save(Factura Factura) {
		facturaRepository.save(facturaMapper.convertirDomainADto(Factura));
	}

	@Override
	public void delete(Codigo codigo) {
		FacturaDto Factura = facturaRepository.findById(codigo.getValue()).orElseThrow(() -> new RegistroNoEncontrado());
		facturaRepository.deleteById(Factura.getCodigo());
	}


}
