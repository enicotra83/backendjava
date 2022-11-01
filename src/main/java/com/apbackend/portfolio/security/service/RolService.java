package com.apbackend.portfolio.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apbackend.portfolio.security.entity.Rol;
import com.apbackend.portfolio.security.enums.RolNombre;
import com.apbackend.portfolio.security.repository.iRolRepository;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository iRolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return iRolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        iRolRepository.save(rol);
    }
}
