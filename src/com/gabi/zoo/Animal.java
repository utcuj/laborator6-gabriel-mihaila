package com.gabi.zoo;

import java.awt.*;

public abstract class Animal {
    private String nume;
    private Color culoare;
    private int varsta;
    private Preparat preparat;
    private Panda panda;

    public Animal(String nume, Color culoare, int varsta){
        this.nume=nume;
        this.culoare=culoare;
        this.varsta=varsta;
    }
    public Animal(){
        this("Neidentificat",Color.WHITE,0);
    }

    public abstract String mananca(Preparat preparat);


    public String toString(){
        return "Nume animal: " + nume + "\n" + "Culoare: " + culoare + "\n" + "Varsta: " + varsta + "\n";
    }

    //gettere si settere
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Preparat getPreparat() {
        return preparat;
    }

    public void setPreparat(Preparat preparat) {
        this.preparat = preparat;
    }
}
