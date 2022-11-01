package com.apbackend.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apbackend.portfolio.models.Proyectos;

public interface ProyectosRepo extends JpaRepository<Proyectos,Long> {
    
}
