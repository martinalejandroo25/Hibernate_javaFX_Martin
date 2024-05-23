package com.example.hibernate_javafx_martin.models;

import java.util.Objects;

public class Juego {

    /*DECLARACION DE ATRIBUTOS*/
    private String nombre;
    private String plataforma;
    private int pegi;
    private enum categoria{};

    /*CONTRUCTORES*/
    public Juego() {
    }

    public Juego(String nombre, String plataforma, int pegi) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.pegi = pegi;
    }

    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    /*EQUALS AND HASHCODE*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return Objects.equals(nombre, juego.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    /*TO STRING*/
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Juego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", plataforma='").append(plataforma).append('\'');
        sb.append(", pegi=").append(pegi);
        sb.append('}');
        return sb.toString();
    }



}
