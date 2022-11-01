package com.apbackend.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lenguaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLenguaje;
    private String nombreLenguaje;
    private String vinculoLenguaje;
    private String sourceLenguaje;

    public Lenguaje() {
    }

    public Lenguaje(Long idLenguaje, String nombreLenguaje, String vinculoLenguaje, String sourceLenguaje) {
        this.idLenguaje = idLenguaje;
        this.nombreLenguaje = nombreLenguaje;
        this.vinculoLenguaje = vinculoLenguaje;
        this.sourceLenguaje = sourceLenguaje;
    }

    public Long getIdLenguaje() {
        return idLenguaje;
    }

    public void setIdLenguaje(Long idLenguaje) {
        this.idLenguaje = idLenguaje;
    }

    public String getNombreLenguaje() {
        return nombreLenguaje;
    }

    public void setNombreLenguaje(String nombreLenguaje) {
        this.nombreLenguaje = nombreLenguaje;
    }

    public String getVinculoLenguaje() {
        return vinculoLenguaje;
    }

    public void setVinculoLenguaje(String vinculoLenguaje) {
        this.vinculoLenguaje = vinculoLenguaje;
    }

    public String getSourceLenguaje() {
        return sourceLenguaje;
    }

    public void setSourceLenguaje(String sourceLenguaje) {
        this.sourceLenguaje = sourceLenguaje;
    }

}
