package com.example.hibernate_javafx_martin.models;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Partida {
    /*DECLARACION DE ATRIBUTOS*/
    private LocalDateTime fechaPartida;
    private Duration duracionPartida;
    private Juego juego;
    private Jugador ganador;
    private List<Jugador> participantes;

    /*CONSTRUCTORES*/

    public Partida() {
    }

    public Partida(LocalDateTime fechaPartida, Duration duracionPartida, Juego juego, Jugador ganador, List<Jugador> participantes) {
        this.fechaPartida = fechaPartida;
        this.duracionPartida = duracionPartida;
        this.juego = juego;
        this.ganador = ganador;
        this.participantes = participantes;
    }

    /*GETTERS Y SETTERS*/

    public LocalDateTime getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDateTime fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public Duration getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(Duration duracionPartida) {
        this.duracionPartida = duracionPartida;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
    }

    public List<Jugador> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Jugador> participantes) {
        this.participantes = participantes;
    }

    /*EQUALS AND HASHCODE*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partida partida = (Partida) o;
        return Objects.equals(fechaPartida, partida.fechaPartida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaPartida);
    }

    /*TO STRING*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("fechaPartida=").append(fechaPartida);
        sb.append(", duracionPartida=").append(duracionPartida);
        sb.append(", juego=").append(juego);
        sb.append(", ganador=").append(ganador);
        sb.append(", participantes=").append(participantes);
        sb.append('}');
        return sb.toString();
    }
}
