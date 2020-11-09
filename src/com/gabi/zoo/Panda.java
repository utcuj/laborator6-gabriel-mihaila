package com.gabi.zoo;

import java.awt.*;

public class Panda extends Animal {

    private int nr_ore_dormite;


    @Override
    public String mananca(Preparat preparat) {
        if(preparat.getNume().equals("Bambus") && preparat.getCantitate() > 0){
            preparat.setCantitate(preparat.getCantitate()-1);
            return "Panda-ul mananca bambus!\n" + preparat.toString();
        }
        else
             return "Panda-ul nu manaca!\n" + preparat.toString();
    }

    public Panda(String nume, Color culoare, int varsta, int nr_ore_dormite) {
        super(nume, culoare, varsta);
        this.nr_ore_dormite=nr_ore_dormite;
    }

    public Panda() {
        super();
        this.nr_ore_dormite=0;
    }

    @Override
    public String toString() {
        return super.toString() + "Numar de ore dormite: " + nr_ore_dormite + "\n";
    }

    public int doarme(int nr){
        this.nr_ore_dormite+=nr;
        return this.nr_ore_dormite;
    }

    //gettere si settere
    public int getNr_ore_dormite() {
        return nr_ore_dormite;
    }

    public void setNr_ore_dormite(int nr_ore_dormite) {
        this.nr_ore_dormite = nr_ore_dormite;
    }
}
