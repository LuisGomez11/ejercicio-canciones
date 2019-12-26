package com.example.demo.infraestructura.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Album;
import com.example.demo.domain.services.AlbumService;
import com.example.demo.exceptions.RegistroNoEncontrado;
import com.example.demo.infraestructura.dto.AlbumDto;
import com.example.demo.infraestructura.mapper.AlbumMapper;
import com.example.demo.infraestructura.repository.database.AlbumRepository;
import com.example.demo.shared.domain.Codigo;

@Service
public class AlbumAdapter implements AlbumService{
	
	@Autowired
	AlbumRepository AlbumRepository;
	
	@Autowired
	AlbumMapper AlbumMapper;
	
	@Override
	public List<Album> findAll() {
		return AlbumMapper.convertirListaDtoParaDominio(AlbumRepository.findAll()) ;
	}

	@Override
	public Album findById(Codigo codigo) {
		return AlbumMapper.convertirDtoADomain(AlbumRepository.findById(codigo.getValue()).get());
	}

	@Override
	public void save(Album album) {
		AlbumRepository.save(AlbumMapper.convertirDomainADto(album));
	}

	@Override
	public void delete(Codigo codigo) {
		AlbumDto album = AlbumRepository.findById(codigo.getValue()).orElseThrow(() -> new RegistroNoEncontrado());
		AlbumRepository.deleteById(album.getCodigo());
	}

}
