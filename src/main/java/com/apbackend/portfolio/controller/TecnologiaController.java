package com.apbackend.portfolio.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.apbackend.portfolio.models.Tecnologia;
import com.apbackend.portfolio.services.TecnologiaService;

@RestController
// @CrossOrigin(origins = "https://enicotraap.web.app/")
@CrossOrigin(origins = "*")
@RequestMapping("/api/tecnologia")
public class TecnologiaController {
    private final TecnologiaService tecnologiaService;

    public TecnologiaController(TecnologiaService tecnologiaService) {
        this.tecnologiaService = tecnologiaService;
    }

    @GetMapping
    public ResponseEntity<List<Tecnologia>> traerProyectos() {
        List<Tecnologia> tecnologias = tecnologiaService.traertecnologia();
        return new ResponseEntity<>(tecnologias, HttpStatus.OK);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<Tecnologia> actualizarTecnologia(@RequestBody Tecnologia tecnologia) {
        Tecnologia updateTecnologia = tecnologiaService.actualizarTecnologia(tecnologia);
        return new ResponseEntity<>(updateTecnologia, HttpStatus.OK);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<Tecnologia> agregarTecnologia(@RequestBody Tecnologia tecnologia) {
        Tecnologia nuevaTecnologia = tecnologiaService.agregarTecnologia(tecnologia);
        return new ResponseEntity<>(nuevaTecnologia, HttpStatus.CREATED);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarTecnologia(@PathVariable("id") Long id) {
        tecnologiaService.borrarTecnologia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
