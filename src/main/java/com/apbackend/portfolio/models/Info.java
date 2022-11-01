package com.apbackend.portfolio.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Table(name = "info_user")
@Entity
public class Info implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name ="id_info")
    private Long idInfo;

    @Column(name = "nombre_info", length = 1000, nullable = false)
    private String nombreInfo;

    @Column(name = "posicion_info", length = 1000, nullable = false)
    private String posicion;

    @Column(name = "locacion_info", length = 1000, nullable = false)
    private String locacion;

    @Column(name = "aboutme_info", length = 2000, nullable = false)
    private String aboutMe;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List<Proyectos> proyectosList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idTecno")
    private List<Tecnologia> tecnologiaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idLenguaje")
    private List<Lenguaje> lenguajeList;


    public Info() {
    }

    public Info(Long idInfo, String nombre, String posicion, String locacion, String aboutMe) {
        this.idInfo = idInfo;
        this.nombreInfo = nombre;
        this.posicion = posicion;
        this.locacion = locacion;
        this.aboutMe = aboutMe;
    }

    public Long getId() {
        return idInfo;
    }

    public void setId(Long idInfo) {
        this.idInfo = idInfo;
    }

    public String getNombre() {
        return nombreInfo;
    }

    public void setNombre(String nombreInfo) {
        this.nombreInfo = nombreInfo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}