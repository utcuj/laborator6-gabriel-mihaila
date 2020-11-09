package com.gabi.zoo;

import java.awt.*;

public class Delfin extends Animal {

    private int nr_kilometrtri;

    @Override
    public String mananca(Preparat preparat) {
        if(preparat.getNume().equals("Peste") && preparat.getCantitate() > 0){
            preparat.setCantitate(preparat.getCantitate()-1);
            return "Delfinul mananca peste!\n" + preparat.toString();
        }
        else
            return "Delfinul nu mananca!\n" + preparat.toString();
    }

    public Delfin(String nume, Color culoare, int varsta, int nr_kilometrtri){
        super(nume,culoare,varsta);
        this.nr_kilometrtri=nr_kilometrtri;
    }

    public Delfin() {
        super();
        this.nr_kilometrtri=0;
    }

    @Override
    public String toString() {
        return super.toString() + "Km innotati: " + nr_kilometrtri + "\n";
    }

    //gettere si settere
    public int getNr_kilometrtri() {
        return nr_kilometrtri;
    }

    public void setNr_kilometrtri(int nr_kilometrtri) {
        this.nr_kilometrtri = nr_kilometrtri;
    }
}
