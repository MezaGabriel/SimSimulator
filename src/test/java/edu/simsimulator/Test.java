package edu.simsimulator;

import edu.simsimulator.domain.*;

import static org.assertj.core.api.Assertions.*;


public class Test {

    @org.junit.jupiter.api.Test
    public void Sims(){

        Sim gabriel = new Sim("Gabriel");

        Juego callofduty = new VideojuegoAccion("Call of Duty");
        Juego tetris = new VideojuegoPuzzle("Tetris");
        Juego monopoly = new JuegoDeMesa("Monopoly", 20);
        Juego futbol = new Deporte("Futbol");


        gabriel.jugar(callofduty);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(52);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(50);

        gabriel.jugar(tetris);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(52);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(70);


        gabriel.jugar(monopoly);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(52);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(90);


        gabriel.jugar(futbol);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(67);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(90);


        gabriel.jugar(callofduty);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(69);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(90);


        gabriel.jugar(tetris);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(69);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(100);


        gabriel.jugar(monopoly);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(69);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(100);


        gabriel.jugar(futbol);
        assertThat(gabriel.getAgilidad().getValorActual())
                .isEqualTo(84);
        assertThat(gabriel.getInteligencia().getValorActual())
                .isEqualTo(100);


    }
}
