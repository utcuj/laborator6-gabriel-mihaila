package com.gabi.rechizita;

public class Manual extends Rechizita {

    public Manual(String eticheta) {
        super(eticheta);
    }

    @Override
    public String getNume() {
        return "Manual " + eticheta;
    }
}
