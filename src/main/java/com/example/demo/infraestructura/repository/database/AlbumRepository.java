package com.example.demo.infraestructura.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.infraestructura.dto.AlbumDto;

public interface AlbumRepository extends JpaRepository<AlbumDto, String>{

}
