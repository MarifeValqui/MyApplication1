package com.example.myapplication1.adapter;

public class Persona {
    private String nombre;
    private String numeroDeCelular;

    public Persona(String nombre, String numeroDeCelular) {
        this.nombre = nombre;
        this.numeroDeCelular = numeroDeCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroDeCelular() {
        return numeroDeCelular;
    }
}

