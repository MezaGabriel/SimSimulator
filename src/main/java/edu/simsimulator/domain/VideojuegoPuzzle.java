package edu.simsimulator.domain;
public class VideojuegoPuzzle extends Videojuego{
    public VideojuegoPuzzle(String nombre){
        super(nombre, GeneroDeVideojuego.PUZZLE);
    }
    @Override
    protected void jugar(Sim jugador) {
        jugador.incrementar(EstadisticasDisponibles.INTELIGENCIA,20);
    }
}
