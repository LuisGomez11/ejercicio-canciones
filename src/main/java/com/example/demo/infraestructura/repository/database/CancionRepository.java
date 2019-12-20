package com.example.demo.infraestructura.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.infraestructura.dto.CancionDto;

public interface CancionRepository extends JpaRepository<CancionDto, String>{

}
