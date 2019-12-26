package com.example.demo.infraestructura.repository.adapters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.model.Cancion;
import com.example.demo.domain.services.CancionService;
import com.example.demo.exceptions.RegistroNoEncontrado;
import com.example.demo.infraestructura.dto.CancionDto;
import com.example.demo.infraestructura.mapper.CancionMapper;
import com.example.demo.infraestructura.repository.database.CancionRepository;
import com.example.demo.shared.domain.Codigo;

public class CancionAdapter implements CancionService{

	@Autowired
	CancionRepository cancionRepository;
	
	@Autowired
	CancionMapper cancionMapper;
	
	@Override
	public List<Cancion> findAll() {
		return cancionMapper.convertirListaDtoParaDominio(cancionRepository.findAll()) ;
	}

	@Override
	public Cancion findById(Codigo codigo) {
		return cancionMapper.convertirDtoADomain(cancionRepository.findById(codigo.toString()).get());
	}

	@Override
	public List<Cancion> findByIds(List<String> codigos) {
		return cancionRepository.findAllById(codigos.stream().map(codigo -> codigo).collect(Collectors.toList()))
				.stream().map(cancion -> cancionMapper.convertirDtoADomain(cancion))
				.collect(Collectors.toList());
	}

	@Override
	public void save(Cancion cancion) {
		cancionRepository.save(cancionMapper.convertirDomainADto(cancion));
	}

	@Override
	public void delete(Codigo codigo) {
		CancionDto cancion = cancionRepository.findById(codigo.toString()).orElseThrow(() -> new RegistroNoEncontrado());
		cancionRepository.deleteById(cancion.getCodigo());
	}

}
