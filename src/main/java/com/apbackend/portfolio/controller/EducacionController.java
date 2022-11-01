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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.apbackend.portfolio.models.Educacion;
import com.apbackend.portfolio.services.EducacionService;

@RestController
@RequestMapping("/api/educacion")
@CrossOrigin(origins = "https://enicotraap.web.app/")
//@CrossOrigin(origins = "*")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping
    public ResponseEntity<List<Educacion>> traerEducacion() {
        List<Educacion> educaciones = educacionService.traerEducacion();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.actualizarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
        Educacion nuevaEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion, HttpStatus.CREATED);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id) {
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
