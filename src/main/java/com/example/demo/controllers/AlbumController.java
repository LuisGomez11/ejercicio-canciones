package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.aplication.AlbumAplication;
import com.example.demo.domain.services.AlbumService;
import com.example.demo.infraestructura.mapper.AlbumMapper;
import com.example.demo.infraestructura.restdto.AlbumRestDto;
import com.example.demo.shared.domain.Codigo;

@RestController
@RequestMapping("/api/album")
public class AlbumController {

	AlbumAplication albumAplication;
	
	public AlbumController(AlbumService albumService, AlbumMapper albumMapper) {
		this.albumAplication = new AlbumAplication(albumService, albumMapper);
	}
	
	@GetMapping
	public List<AlbumRestDto> getAlbumes(){
		return albumAplication.getAlbumes();
	}
	
	@GetMapping("/{codigo}")
	public AlbumRestDto getAlbum(@PathVariable Codigo codigo) {
		return albumAplication.getAlbum(codigo);
	}
	
	@PostMapping
	public void save(@RequestBody AlbumRestDto album) {
		albumAplication.save(album);
	}
	
}
