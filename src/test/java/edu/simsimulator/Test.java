package edu.simsimulator;

import edu.simsimulator.domain.*;

import static org.assertj.core.api.Assertions.*;


public class Test {

    @org.junit.jupiter.api.Test
    public void crearSimStandar() {

        Sim sim = new Sim("Gabriel");

        assertThat(sim)
                .hasFieldOrPropertyWithValue("nombre", "Gabriel");

        assertThat(sim.getEstadistica(EstadisticasDisponibles.AGILIDAD))
                .isEqualTo(50);

        assertThat(sim.getEstadistica(EstadisticasDisponibles.INTELIGENCIA))
                .isEqualTo(50);

    }

    @org.junit.jupiter.api.Test
    public void crearSimPersonalizado(){

        Sim sim = new Sim("Gabriel", 150, -10);

        assertThat(sim)
                .hasFieldOrPropertyWithValue("nombre", "Gabriel");

        assertThat(sim.getEstadistica(EstadisticasDisponibles.AGILIDAD))
                .isEqualTo(0);

        assertThat(sim.getEstadistica(EstadisticasDisponibles.INTELIGENCIA))
                .isEqualTo(100);

    }

    @org.junit.jupiter.api.Test
    public void jugarJuegos(){

        Sim sim = new Sim("Gabriel");

        Juego callofduty = new VideojuegoAccion("Call of Duty");
        Juego tetris = new VideojuegoPuzzle("Tetris");
        Juego monopoly = new JuegoDeMesa("Monopoly", 20);
        Juego futbol = new Deporte("Futbol");


        sim.jugar(callofduty);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.AGILIDAD))
                .isEqualTo(52);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.INTELIGENCIA))
                .isEqualTo(50);

        sim.jugar(tetris);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.AGILIDAD))
                .isEqualTo(52);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.INTELIGENCIA))
                .isEqualTo(70);


        sim.jugar(monopoly);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.AGILIDAD))
                .isEqualTo(52);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.INTELIGENCIA))
                .isEqualTo(90);


        sim.jugar(futbol);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.AGILIDAD))
                .isEqualTo(67);
        assertThat(sim.getEstadistica(EstadisticasDisponibles.INTELIGENCIA))
                .isEqualTo(90);


    }
}
