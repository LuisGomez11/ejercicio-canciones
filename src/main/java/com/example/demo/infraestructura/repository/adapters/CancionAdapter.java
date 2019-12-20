package com.example.demo.infraestructura.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.model.Cancion;
import com.example.demo.domain.services.CancionService;
import com.example.demo.infraestructura.mapper.CancionMapper;
import com.example.demo.infraestructura.repository.database.CancionRepository;
import com.example.demo.shared.domain.Codigo;

public class CancionAdapter implements CancionService{

	@Autowired
	CancionRepository cancionRepository;
	
	CancionMapper cancionMapper = new CancionMapper();
	
	@Override
	public List<Cancion> findAll() {
		return cancionMapper.convertirListaDtoParaDominio(cancionRepository.findAll()) ;
	}

	@Override
	public Cancion findById(Codigo codigo) {
		return cancionRepository.findById(codigo.toString()).get();
	}

	@Override
	public List<Cancion> findByIds(List<Codigo> codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Cancion cancion) {
		cancionRepository.save(cancion);
	}

	@Override
	public void delete(Codigo codigo) {
		cancionRepository.deleteById(codigo.toString());
	}

}
