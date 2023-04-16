package edu.simsimulator.domain;
public class Estadistica {
    private int limiteInferior;
    private int limiteSuperior;
    private int valorActual;

    public Estadistica(int limiteInferior, int limiteSuperior, int valorActual){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.valorActual = calcularValorReal(valorActual);
    }
    public Estadistica(int valorActual){
        this(0, 100, valorActual);
    }

    private int calcularValorReal(int valorActual){
        if(valorActual > limiteSuperior) return limiteSuperior;
        else if(valorActual < limiteInferior) return limiteInferior;
        return valorActual;
    }
    public void incrementar(int valorAIncrementar){
        int valorIncrementado = valorActual + valorAIncrementar;
        int valorReal = calcularValorReal(valorIncrementado);
        valorActual = valorReal;
    }
    public int getValorActual(){
        return calcularValorReal(valorActual);
    }
}
