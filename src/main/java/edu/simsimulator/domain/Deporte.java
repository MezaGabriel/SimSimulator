package edu.simsimulator.domain;

import java.util.ArrayList;
import java.util.List;

public class Deporte extends Actividad{


    public Deporte(String nombre) {
        super();
    }


    @Override
    protected double aumento(List list, Sim sim) {
        int aumento = 15;
        double resp = sim.setAgilidad(sim.getAgilidad() + aumento);
        return aumento;
    }

}
