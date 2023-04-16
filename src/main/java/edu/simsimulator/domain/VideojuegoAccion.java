package edu.simsimulator.domain;
public class VideojuegoAccion extends Videojuego{
    public VideojuegoAccion(String nombre){
        super(nombre, GeneroDeVideojuego.ACCION);
    }
    @Override
    protected void jugar(Sim jugador) {
        jugador.aumentarAgilidad(2);
    }
}
