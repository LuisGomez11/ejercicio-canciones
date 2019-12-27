package com.example.demo.aplication;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.services.CancionService;
import com.example.demo.infraestructura.mapper.CancionMapper;
import com.example.demo.infraestructura.restdto.CancionRestDto;
import com.example.demo.shared.domain.Codigo;

public class CancionAplication {

	@Autowired
	CancionService cancionService;
	
	@Autowired
	CancionMapper cancionMapper;
	
	public CancionAplication(CancionService cancionService, CancionMapper cancionMapper) {
		this.cancionService = cancionService;
		this.cancionMapper = cancionMapper;
	}
	
	public void save(CancionRestDto cancion) {
		if(cancion.getCodigo() == null) {
			cancion.setCodigo(UUID.randomUUID().toString());
		}
		cancionService.save(cancionMapper.apiConvertirDtoADomain(cancion));
	}
	
	public List<CancionRestDto> getCanciones(){
		return cancionMapper.apiConvertirListaDominioParaDto(cancionService.findAll());
	}
	
	public CancionRestDto getCancion(Codigo codigo) {
		return cancionMapper.apiConvertirDomainADto(cancionService.findById(codigo));
	}
	
	public void delete(Codigo codigo) {
		cancionService.delete(codigo);
	}
	
}
