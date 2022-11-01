package com.apbackend.portfolio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.apbackend.portfolio.models.Tecnologia;
import com.apbackend.portfolio.repository.TecnologiaRepo;

@Service
@Transactional
public class TecnologiaService {
    private final TecnologiaRepo tecnologiaRepo;

    @Autowired
    public TecnologiaService(TecnologiaRepo tecnologiaRepo) {
        this.tecnologiaRepo = tecnologiaRepo;
    }

    public Tecnologia agregarTecnologia(Tecnologia tecnologia) {
        return tecnologiaRepo.save(tecnologia);
    }

    public List<Tecnologia> traertecnologia() {
        return tecnologiaRepo.findAll();
    }

    public Tecnologia actualizarTecnologia(Tecnologia tecnologia) {
        return tecnologiaRepo.save(tecnologia);
    }

    public void borrarTecnologia(Long id) {
        tecnologiaRepo.deleteById(id);
    }
}
