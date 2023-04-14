package edu.simsimulator.domain;

import java.util.List;

public abstract class Actividad{

    protected String nombre;
    protected double dificultad;


    public Actividad(String nombre, double dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public Actividad() {}


    protected abstract double aumento(List list, Sim sim);

}
