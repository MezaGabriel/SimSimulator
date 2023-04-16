package edu.simsimulator.domain;

public class Sim {

    private String nombre;
    private Estadistica inteligencia;
    private Estadistica agilidad;

    public Sim(String nombre, int inteligencia, int agilidad) {
        this.nombre = nombre;
        this.inteligencia = new Estadistica(inteligencia);
        this.agilidad = new Estadistica(agilidad);
    }
    public Sim(String nombre) {
        this(nombre, 50, 50);
    }

    public String getNombre() {
        return nombre;
    }
    public Estadistica getInteligencia() {
        return inteligencia;
    }
    public Estadistica getAgilidad() {
        return agilidad;
    }

    public void jugar(Juego juego) {
        juego.jugar(this);
    }
    public void aumentarAgilidad(int cantidadAIncrementar){
        agilidad.incrementar(cantidadAIncrementar);
    }
    public void aumentarInteligencia(int cantidadAIncrementar){
        inteligencia.incrementar(cantidadAIncrementar);
    }
}
