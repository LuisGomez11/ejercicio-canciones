package com.example.demo.domain.services;

import java.util.List;

import com.example.demo.domain.model.Factura;
import com.example.demo.shared.domain.Codigo;

public interface FacturaService {

	public List<Factura> findAll();
	public Factura findById(Codigo codigo);
	public void save(Factura factura);
	public void delete(Codigo codigo);
	
}
