package edu.simsimulator.domain;

public class JuegoDeMesa extends Juego{

    public JuegoDeMesa(String nombre, int valorActual){
        super(nombre);
    }

    @Override
    protected void jugar(Sim jugador) {
        jugador.incrementar(EstadisticasDisponibles.INTELIGENCIA,20);
    }

}
