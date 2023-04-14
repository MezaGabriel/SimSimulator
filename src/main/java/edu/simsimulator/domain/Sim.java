package edu.simsimulator.domain;

import java.util.List;

public class Sim {


    private double inteligencia;
    private double agilidad;
    private List<Actividad> activities;


    public Sim(List<Actividad> activities) {
        this.inteligencia = 50;
        this.agilidad = 50;
        this.activities = activities;
    }

    public Sim() {
        this.inteligencia = 50;
        this.agilidad = 50;
    }

    public Sim(double inteligencia, double agilidad, List<Actividad> activities) {
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.activities = activities;
    }


    public double getInteligencia() {
        return inteligencia;
    }
    public double setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
        return inteligencia;
    }
    public double getAgilidad() {
        return agilidad;
    }
    public double setAgilidad(double agilidad) {
        this.agilidad = agilidad;
        return agilidad;
    }


    public void jugar() {
        for (Actividad actividad : activities) {
            actividad.aumento(activities, this);
            limpiarStats();
            return;
        }
    }


    public void limpiarStats(){
        if(getInteligencia() > 100)setInteligencia(100);
        if(getInteligencia() < 0)setInteligencia(0);
        if(getAgilidad() > 100)setAgilidad(100);
        if(getAgilidad() < 0)setAgilidad(0);
    }

}
