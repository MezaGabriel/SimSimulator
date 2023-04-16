package edu.simsimulator.domain;

public abstract class Juego {

    protected String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
    }
    public Juego() {}

    protected abstract void jugar(Sim jugador);

}
