package com.example.demo.domain.services;

import java.util.List;

import com.example.demo.domain.model.Cancion;
import com.example.demo.shared.domain.Codigo;

public interface CancionService {

	public List<Cancion> findAll();
	public Cancion findById(Codigo codigo);
	public List<Cancion> findByIds(List<String> codigos);
	public void save (Cancion cancion);
	public void delete (Codigo codigo);
	
}
