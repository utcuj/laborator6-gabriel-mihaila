package com.gabi.zoo;

public class Preparat {
    private String nume;
    private int cantitate;
    private String ora;

    public Preparat(String nume, int cantitate, String ora){
        this.nume=nume;
        this.cantitate=cantitate;
        this.ora=ora;
    }
    public Preparat(){
        this("Neidentificat",0,"00:00");
    }

    public String toString(){
        return "Nume preparat: " + nume + "\nCantitate: " + cantitate + "\nOra servire: " + ora + "\n";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
}
