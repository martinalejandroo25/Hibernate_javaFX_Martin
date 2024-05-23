package com.example.hibernate_javafx_martin.models;

import java.util.Objects;

public class Jugador {

    /*DECLARACION DE ATRIBUTOS*/
    private String nombre;
    private String alias;
    private int edad;
    private String email;
    private String idioma;
    private Juego juegoPreferido;
    private String pais;
    private  byte[] avatar;

    /*CONTRUCTORES*/
    public Jugador() {
    }

    public Jugador(String nombre, String alias, int edad, String email, String idioma, Juego juegoPreferido, String pais, byte[] avatar) {
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
        this.email = email;
        this.idioma = idioma;
        this.juegoPreferido = juegoPreferido;
        this.pais = pais;
        this.avatar = avatar;
    }

    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Juego getJuegoPreferido() {
        return juegoPreferido;
    }

    public void setJuegoPreferido(Juego juegoPreferido) {
        this.juegoPreferido = juegoPreferido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    /*TO STRING*/
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", idioma='").append(idioma).append('\'');
        sb.append(", juegoPreferido=").append(juegoPreferido);
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", avatar=");
        if (avatar == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < avatar.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(avatar[i]);
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
    }

    /*EQUALS AND HASHCODE*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(alias, jugador.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

}
