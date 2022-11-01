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

import com.apbackend.portfolio.models.Lenguaje;
import com.apbackend.portfolio.services.LenguajeService;

@RestController
@RequestMapping("/api/lenguaje")
@CrossOrigin(origins = "https://enicotraap.web.app/")
//@CrossOrigin(origins = "*")
public class LenguajeController {
    private final LenguajeService lenguajeService;

    public LenguajeController(LenguajeService lenguajeService) {
        this.lenguajeService = lenguajeService;
    }

    @GetMapping
    public ResponseEntity<List<Lenguaje>> traerLenguaje() {
        List<Lenguaje> lenguajes = lenguajeService.traerLenguaje();
        return new ResponseEntity<>(lenguajes, HttpStatus.OK);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<Lenguaje> editarLenguaje(@RequestBody Lenguaje lenguaje) {
        Lenguaje updateLenguaje = lenguajeService.actualizarLenguaje(lenguaje);
        return new ResponseEntity<>(updateLenguaje, HttpStatus.OK);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<Lenguaje> agregarLenguaje(@RequestBody Lenguaje lenguaje) {
        Lenguaje nuevoLenguaje = lenguajeService.agregarLenguaje(lenguaje);
        return new ResponseEntity<>(nuevoLenguaje, HttpStatus.CREATED);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarLenguaje(@PathVariable("id") Long id) {
        lenguajeService.borrarLenguaje(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}