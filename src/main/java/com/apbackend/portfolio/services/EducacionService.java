package com.apbackend.portfolio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.apbackend.portfolio.models.Educacion;
import com.apbackend.portfolio.repository.EducacionRepo;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> traerEducacion() {
        return educacionRepo.findAll();
    }

    public Educacion actualizarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }
}
