package com.example.demo.infraestructura.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.model.Album;
import com.example.demo.infraestructura.dto.AlbumDto;
import com.example.demo.infraestructura.restdto.AlbumRestDto;
import com.example.demo.shared.domain.Codigo;
import com.example.demo.shared.domain.Nombre;
import com.example.demo.shared.domain.Valor;
import com.example.demo.shared.infraestructura.MapperApiRest;
import com.example.demo.shared.infraestructura.MapperRepository;

@Component
public class AlbumMapper implements MapperRepository<Album, AlbumDto>, MapperApiRest<Album, AlbumRestDto>{

	@Autowired
	CancionMapper cancionMapper;
	
	@Override
	public Album apiConvertirDtoADomain(AlbumRestDto o) {
		return Album.of(new Codigo(o.getCodigo()), new Nombre(o.getTitulo()), new Valor(o.getValorTotal()),
				cancionMapper.apiConvertirListaDtoParaDominio(o.getCanciones()));
	}

	@Override
	public AlbumRestDto apiConvertirDomainADto(Album i) {
		
		AlbumRestDto album = new AlbumRestDto(i.getCodigo().getValue(), i.getTitulo().getValue(), i.getValorTotal().getValue(), 
				cancionMapper.apiConvertirListaDominioParaDto(i.getCanciones()));
		
		return album;
	}

	@Override
	public Album convertirDtoADomain(AlbumDto o) {
		return Album.of(new Codigo(o.getCodigo()), new Nombre(o.getTitulo()), new Valor(o.getValorTotal()),
				cancionMapper.convertirListaDtoParaDominio(o.getCanciones()));
	}

	@Override
	public AlbumDto convertirDomainADto(Album i) {
		AlbumDto album = new AlbumDto();
		album.setCodigo(i.getCodigo().getValue());
		album.setTitulo(i.getTitulo().getValue());
		album.setValorTotal(i.getValorTotal().getValue());
		album.setCanciones(cancionMapper.convertirListDominioParaDto(i.getCanciones()));
		
		return album;
	}

}
