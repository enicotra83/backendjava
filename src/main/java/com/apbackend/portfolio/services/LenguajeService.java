package com.apbackend.portfolio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.apbackend.portfolio.models.Lenguaje;
import com.apbackend.portfolio.repository.LenguajeRepo;

@Service
@Transactional
public class LenguajeService {
    private final LenguajeRepo lenguajeRepo;

    @Autowired
    public LenguajeService(LenguajeRepo lenguajeRepo) {
        this.lenguajeRepo = lenguajeRepo;
    }

    public Lenguaje agregarLenguaje(Lenguaje lenguaje) {
        return lenguajeRepo.save(lenguaje);
    }

    public List<Lenguaje> traerLenguaje() {
        return lenguajeRepo.findAll();
    }

    public Lenguaje actualizarLenguaje(Lenguaje lenguaje) {
        return lenguajeRepo.save(lenguaje);
    }

    public void borrarLenguaje(Long id) {
        lenguajeRepo.deleteById(id);
    }
}