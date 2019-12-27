package com.example.demo.aplication;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.services.AlbumService;
import com.example.demo.infraestructura.mapper.AlbumMapper;
import com.example.demo.infraestructura.restdto.AlbumRestDto;
import com.example.demo.shared.domain.Codigo;

public class AlbumAplication {

	@Autowired
	AlbumService albumService;
	
	@Autowired
	AlbumMapper albumMapper;

	
	
	public AlbumAplication(AlbumService albumService, AlbumMapper albumMapper) {
		this.albumService = albumService;
		this.albumMapper = albumMapper;
	}

	public void save(AlbumRestDto album) {
		
		if(album.getCodigo() == null) {
			album.setCodigo(UUID.randomUUID().toString());
		}
		
		albumService.save(albumMapper.apiConvertirDtoADomain(album));
	}
	
	public List<AlbumRestDto> getAlbumes(){
		return albumMapper.apiConvertirListaDominioParaDto(albumService.findAll());
	}
	
	public AlbumRestDto getAlbum(Codigo codigo) {
		return albumMapper.apiConvertirDomainADto(albumService.findById(codigo));
	}
	
}
