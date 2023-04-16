package edu.simsimulator.domain;

public class Deporte extends Juego{

    public Deporte(String nombre){
        super(nombre);
    }

    @Override
    protected void jugar(Sim jugador) {
        jugador.aumentarAgilidad(15);
    }

}
