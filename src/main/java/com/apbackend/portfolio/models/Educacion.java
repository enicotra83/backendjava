package com.apbackend.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private String descripcionEdu;
    private String certificadoEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String descripcionEdu, String certificadoEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.descripcionEdu = descripcionEdu;
        this.certificadoEdu = certificadoEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getCertificadoEdu() {
        return certificadoEdu;
    }

    public void setCertificadoEdu(String certificadoEdu) {
        this.certificadoEdu = certificadoEdu;
    }

}
