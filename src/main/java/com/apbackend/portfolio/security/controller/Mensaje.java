package com.apbackend.portfolio.security.controller;

public class Mensaje {
    private String Mensaje;

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }
    
}
