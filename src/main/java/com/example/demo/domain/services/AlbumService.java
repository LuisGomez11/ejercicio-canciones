package com.example.demo.domain.services;

import java.util.List;

import com.example.demo.domain.model.Album;
import com.example.demo.shared.domain.Codigo;

public interface AlbumService {

	public List<Album> findAll();
	public Album findById(Codigo codigo);
	public void save(Album album);
	public void delete(Codigo codigo);
}
