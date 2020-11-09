package com.gabi.zoo;

public class Ingrijitor {
    private String nume;
    private int varsta;
    private String specializare;

    public Ingrijitor(String nume, int varsta, String specializare){
        this.nume=nume;
        this.varsta=varsta;
        this.specializare=specializare;
    }

    public String toString(){
        return "Nume ingrijitor: " + nume + "\nVarsta: " + varsta + "\nSpecializarea: " + specializare + "\n";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
