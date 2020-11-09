package com.gabi.zoo;

import java.awt.*;

public class Pinguin extends Animal {

    private int nr_pasi;

    @Override
    public String mananca(Preparat preparat) {
        if((preparat.getNume().equals("Peste") && preparat.getCantitate() > 0 )){
            preparat.setCantitate(preparat.getCantitate()-1);
            return "Pinguinul mananca peste!\n" + preparat.toString();
        }
        else{
            if((preparat.getNume().equals("Pop corn") && preparat.getCantitate() > 0 )) {
                preparat.setCantitate(preparat.getCantitate() - 1);
                return "Pinguinul mananca pop corn!\n" + preparat.toString();
            }
            else
                return "Pinguinul nu mananca!\n" + preparat.toString();
        }
    }

    public Pinguin(String nume, Color culoare, int varsta, int nr_pasi) {
        super(nume, culoare, varsta);
        this.nr_pasi=nr_pasi;
    }

    public Pinguin() {
        super();
        this.nr_pasi=0;
    }

    @Override
    public String toString() {
        return super.toString() + "Nr pasi parcursi: " + nr_pasi + "\n";
    }

    //gettere si settere
    public int getNr_pasi() {
        return nr_pasi;
    }

    public void setNr_pasi(int nr_pasi) {
        this.nr_pasi = nr_pasi;
    }
}
