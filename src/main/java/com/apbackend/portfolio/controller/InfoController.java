package com.apbackend.portfolio.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.apbackend.portfolio.models.Info;
import com.apbackend.portfolio.services.InfoService;

@RestController
@RequestMapping("/api/info")
// @CrossOrigin(origins = "https://enicotraap.web.app/")
@CrossOrigin(origins = "**")
public class InfoController {
    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Info> obtenerInfo(@PathVariable("id") Long id) {
        Info info = infoService.buscarInfoPorId(id);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<Info> editarInfo(@RequestBody Info info) {
        Info updateInfo = infoService.actualizarInfo(info);
        return new ResponseEntity<>(updateInfo, HttpStatus.OK);
    }
}
