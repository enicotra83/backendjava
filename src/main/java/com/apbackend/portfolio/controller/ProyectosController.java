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

import com.apbackend.portfolio.models.Proyectos;
import com.apbackend.portfolio.services.ProyectosService;

@RestController
@RequestMapping("/api/proyectos")
// @CrossOrigin(origins = "https://enicotraap.web.app/")
@CrossOrigin(origins = "*")

public class ProyectosController {
    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @GetMapping
    public ResponseEntity<List<Proyectos>> traerProyectos() {
        List<Proyectos> proyectosLista = proyectosService.traerProyectos();
        return new ResponseEntity<>(proyectosLista, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<Proyectos> actualizarProyectos(@RequestBody Proyectos proyectos) {
        Proyectos updateProyecto = proyectosService.actualizarProyectos(proyectos);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<Proyectos> agregarProyectos(@RequestBody Proyectos proyectos) {
        Proyectos nuevoProyecto = proyectosService.agregarProyectos(proyectos);
        return new ResponseEntity<>(nuevoProyecto, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarProyectos(@PathVariable("id") Long id) {
        proyectosService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
