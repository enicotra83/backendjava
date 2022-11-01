package com.apbackend.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTecno;
    private String tituloTecno;
    private String iconoTecno;

    public Tecnologia() {
    }

    public Tecnologia(Long idTecno, String tituloTecno, String iconoTecno) {
        this.idTecno = idTecno;
        this.tituloTecno = tituloTecno;
        this.iconoTecno = iconoTecno;
    }

    public Long getIdTecno() {
        return idTecno;
    }

    public void setIdTecno(Long idTecno) {
        this.idTecno = idTecno;
    }

    public String getTituloTecno() {
        return tituloTecno;
    }

    public void setTituloTecno(String tituloTecno) {
        this.tituloTecno = tituloTecno;
    }

    public String getIconoTecno() {
        return iconoTecno;
    }

    public void setIconoTecno(String iconoTecno) {
        this.iconoTecno = iconoTecno;
    }
}
