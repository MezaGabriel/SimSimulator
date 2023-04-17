package edu.simsimulator.domain;

import java.util.Map;

public class Sim {

    private String nombre;
    private Map<EstadisticasDisponibles, Estadistica> estadisticas;

    public Sim(String nombre, int inteligencia, int agilidad) {
        this.nombre = nombre;
        this.estadisticas = generarEstadisticas(inteligencia, agilidad);
    }
    public Sim(String nombre) {
        this(nombre, 50, 50);
    }

    public int getEstadistica(EstadisticasDisponibles estadisticaAConsultar) {
        return estadisticas.get(estadisticaAConsultar).getValorActual();
    }

    public void jugar(Juego juego) {
        juego.jugar(this);
    }

    public void incrementar(EstadisticasDisponibles estadisticaAIncrementar, int valorAIncrementar){
        estadisticas.get(estadisticaAIncrementar).incrementar(valorAIncrementar);
    }

    private Map<EstadisticasDisponibles, Estadistica> generarEstadisticas(int inteligencia, int agilidad){
        return Map.of(
            EstadisticasDisponibles.INTELIGENCIA, new Estadistica(inteligencia),
            EstadisticasDisponibles.AGILIDAD, new Estadistica(agilidad)
        );
    }

}
