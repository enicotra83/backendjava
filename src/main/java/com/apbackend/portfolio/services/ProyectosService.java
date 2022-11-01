package com.apbackend.portfolio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.apbackend.portfolio.models.Proyectos;
import com.apbackend.portfolio.repository.ProyectosRepo;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;

    @Autowired
    public ProyectosService (ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyectos agregarProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> traerProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos actualizarProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public void borrarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }
}
