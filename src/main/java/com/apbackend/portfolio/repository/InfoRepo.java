package com.apbackend.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apbackend.portfolio.models.Info;

public interface InfoRepo extends JpaRepository<Info, Long> {
    
}
