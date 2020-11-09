package com.gabi.rechizita;

public abstract class Rechizita {
    String eticheta;

    public abstract String getNume();

    public Rechizita(String eticheta){
        this.eticheta=eticheta;
    }
}
