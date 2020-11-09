package com.gabi.zoo;

public class GradinaZoo {
    private String nume;
    private int nr_animale;
    private Preparat preparat;
    private Animal[] animaleZoo;
    private int i=0;

    public GradinaZoo(String nume, int nr_animale){
        this.nume=nume;
        this.nr_animale=nr_animale;
        this.animaleZoo= new Animal[nr_animale];
    }



    public void addAnimale(Animal animal, Preparat preparat){
        animaleZoo[i]=animal;
        animaleZoo[i].setPreparat(preparat);
        i++;
    }

    public void listAnimale(){
        for(int ct=0;ct<i;ct++){
            System.out.println(animaleZoo[ct].toString() + animaleZoo[ct].mananca(animaleZoo[ct].getPreparat()));
        }
    }

    public int nrPinguini(){
        int nr_pinguini=0;
        for(int ct=0;ct<i;ct++){
            if(animaleZoo[ct] instanceof Pinguin)
                nr_pinguini++;
        }
        return nr_pinguini;
    }

    public int nrPanda(){
        int nr_panda=0;
        for(int ct=0;ct<i;ct++){
            if(animaleZoo[ct] instanceof Panda)
                nr_panda++;
        }
        return nr_panda;
    }

    public int nrDelfini(){
        int nr_delfini=0;
        for(int ct=0;ct<i;ct++){
            if(animaleZoo[ct] instanceof Delfin)
                nr_delfini++;
        }
        return nr_delfini;
    }


    //gettere si settere
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNr_animale() {
        return nr_animale;
    }

    public void setNr_animale(int nr_animale) {
        this.nr_animale = nr_animale;
    }

    public Animal[] getAnimaleZoo() {
        return animaleZoo;
    }

    public void setAnimaleZoo(Animal[] animaleZoo) {
        this.animaleZoo = animaleZoo;
    }
}
