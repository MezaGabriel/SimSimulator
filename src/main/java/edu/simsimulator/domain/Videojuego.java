package edu.simsimulator.domain;

import java.util.ArrayList;
import java.util.List;

public class Videojuego extends Actividad{


    public Videojuego(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    protected double aumento(List list, Sim sim) {

        double resp = 0;
        double aumentoPuzzle = 20;
        double aumentoAccion = 2;

        for (Object obj : list) {
            if (this.equals(obj)) {
                resp = sim.setInteligencia(sim.getInteligencia() + aumentoPuzzle);
            } else {
                resp = sim.setAgilidad(sim.getAgilidad() + aumentoAccion);
            }
        }
        return resp;
    }
}
