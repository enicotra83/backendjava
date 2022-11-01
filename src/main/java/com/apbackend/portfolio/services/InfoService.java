package com.apbackend.portfolio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.apbackend.portfolio.exception.UserNotFoundException;
import com.apbackend.portfolio.models.Info;
import com.apbackend.portfolio.repository.InfoRepo;

@Service
@Transactional
public class InfoService {
    private final InfoRepo infoRepo;

    @Autowired
    public InfoService(InfoRepo infoRepo) {
        this.infoRepo = infoRepo;
    }

    public Info agregarInfo(Info info) {
        return infoRepo.save(info);
    }

    public List<Info> traerInfo() {
        return infoRepo.findAll();
    }

    public Info actualizarInfo(Info info) {
        return infoRepo.save(info);
    }

    public void borrarInfo(Long id) {
        infoRepo.deleteById(id);
    }

    public Info buscarInfoPorId(Long id){
        return infoRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario No Encontrado"));

    }
}
