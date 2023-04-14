package edu.simsimulator.domain;

import java.util.ArrayList;
import java.util.List;

public class JuegoDeMesa extends Actividad{


    private List<JuegoDeMesa> games;


    public JuegoDeMesa(String nombre, double dificultad) {
        super(nombre, dificultad);
        this.games = new ArrayList<>();
    }


    public double getDificultad() {
        return dificultad;
    }
    public List<JuegoDeMesa> getGames() {
        return games;
    }


    @Override
    protected double aumento(List list, Sim sim) {
        int aumento = 0;
        for (Object obj : list) {
            if (!games.contains(getGames()) && !games.contains((JuegoDeMesa) obj)) {
                games.add((JuegoDeMesa) obj);
                aumento += ((JuegoDeMesa) obj).getDificultad();
            } else {
                return 0;
            }
        }
        double resp = sim.setInteligencia(sim.getInteligencia() + aumento);
        return aumento;
    }

}
