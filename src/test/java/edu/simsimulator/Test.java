package edu.simsimulator;

import edu.simsimulator.domain.*;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class Test {

    @org.junit.jupiter.api.Test
    public void Sims(){

        Sim gabriel = new Sim(List.of(
                new JuegoDeMesa("Uno", 35))
        );
        Sim jorge = new Sim(-30, 130, List.of(
                new JuegoDeMesa("Uno", 25))
        );
        Sim marcelo = new Sim(List.of(
                new Videojuego("accion"),
                new Videojuego("puzzle"))
        );
        Sim mauricio = new Sim(List.of(
                new Deporte("futbol"))
        );


        gabriel.jugar();
        jorge.jugar();
        marcelo.jugar();
        mauricio.jugar();


        assertThat(gabriel.getInteligencia())
                .isEqualTo(85);

        assertThat(jorge.getInteligencia())
                .isEqualTo(0);
        assertThat(jorge.getAgilidad())
                .isEqualTo(100);

        assertThat(marcelo.getInteligencia())
                .isEqualTo(70);
        assertThat(marcelo.getAgilidad())
                .isEqualTo(52);

        assertThat(mauricio.getAgilidad())
                .isEqualTo(65);

    }
}
