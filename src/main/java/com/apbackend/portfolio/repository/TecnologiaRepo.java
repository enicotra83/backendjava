package com.apbackend.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apbackend.portfolio.models.Tecnologia;

public interface TecnologiaRepo extends JpaRepository<Tecnologia, Long>{
    
}
