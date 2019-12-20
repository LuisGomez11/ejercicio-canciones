package com.example.demo.infraestructura.mapper;

import com.example.demo.domain.model.Cancion;
import com.example.demo.infraestructura.dto.CancionDto;
import com.example.demo.infraestructura.restdto.CancionRestDto;
import com.example.demo.shared.domain.Calificacion;
import com.example.demo.shared.domain.Codigo;
import com.example.demo.shared.domain.Duracion;
import com.example.demo.shared.domain.Genero;
import com.example.demo.shared.domain.Nombre;
import com.example.demo.shared.domain.Valor;
import com.example.demo.shared.infraestructura.MapperApiRest;
import com.example.demo.shared.infraestructura.MapperRepository;

public class CancionMapper implements MapperRepository<Cancion, CancionDto>, MapperApiRest<Cancion, CancionRestDto>{

	@Override
	public Cancion convertirDtoADomain(CancionDto o) {
		return Cancion.of(new Codigo(o.getCodigo()), new Nombre(o.getNombre()), new Nombre(o.getAutor()), new Valor(o.getValor()),
				new Duracion(o.getDuracion()), new Genero(o.getGenero()), new Calificacion(o.getCalificacion()));
	}

	@Override
	public CancionDto convertirDomainADto(Cancion i) {
		
		CancionDto cancion = new CancionDto();
		cancion.setCodigo(i.getCodigo().getValue());
		cancion.setNombre(i.getNombre().getValue());
		cancion.setAutor(i.getAutor().getValue());
		cancion.setValor(i.getValor().getValue());
		cancion.setDuracion(i.getDuracion().getValue());
		cancion.setGenero(i.getGenero().getValue());
		cancion.setCalificacion(i.getCalificacion().getValue());
		
		return cancion;
	}

	@Override
	public Cancion apiConvertirDtoADomain(CancionRestDto o) {
		return Cancion.of(new Codigo(o.getCodigo()), new Nombre(o.getNombre()), new Nombre(o.getAutor()), new Valor(o.getValor()),
				new Duracion(o.getDuracion()), new Genero(o.getGenero()), new Calificacion(o.getCalificacion()));
	}

	@Override
	public CancionRestDto apiConvertirDomainADto(Cancion i) {
		
		CancionRestDto cancion = new CancionRestDto();
		cancion.setCodigo(i.getCodigo().getValue());
		cancion.setNombre(i.getNombre().getValue());
		cancion.setAutor(i.getAutor().getValue());
		cancion.setValor(i.getValor().getValue());
		cancion.setDuracion(i.getDuracion().getValue());
		cancion.setGenero(i.getGenero().getValue());
		cancion.setCalificacion(i.getCalificacion().getValue());
		
		return cancion;
	}

}
