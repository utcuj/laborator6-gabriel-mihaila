package com.gabi.rechizita;

public class Caiet extends Rechizita {

    public Caiet(String eticheta) {
        super(eticheta);
    }

    public Caiet(){
       this("necunoscut");
    }

    @Override
    public String getNume() {
        return "Caiet " + eticheta;
    }
}
