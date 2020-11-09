package com.gabi.zoo;

import java.awt.*;
import java.util.Scanner;

public class TestZoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nume_zoo;
        int nr_animale;



        System.out.println("Dati numele la zoo: ");
        nume_zoo=input.nextLine();
        System.out.println("Dati nr de animale: ");
        nr_animale=input.nextInt();

        Mancare mancare = new Mancare();

        Preparat p1=new Preparat("Peste",5,"13:00");
        Preparat p2=new Preparat("Bambus",9,"11:00");
        Preparat p3=new Preparat("Banane",10,"17:00");
        Preparat p4=new Preparat("Pop corn",3,"15:00");
        Preparat p5=new Preparat("Porumb",7,"18:00");

        mancare.addPreparat(p1);
        mancare.addPreparat(p2);
        mancare.addPreparat(p3);
        mancare.addPreparat(p4);
        mancare.addPreparat(p5);

        System.out.println("Lista de mancare sortata dupa cantitate:");
        mancare.sortMancare();
        //mancare.listMancare();
        mancare.listMancareByFor();

        System.out.println("Lista de mancare sortata dupa nume:");
        mancare.sortMancareByName();
        //mancare.listMancare();
        mancare.listMancareByFor();

        GradinaZoo gradinaZoo= new GradinaZoo(nume_zoo,nr_animale);
        System.out.println("Gradina zoo: " + gradinaZoo.getNume() + "\n" + "Numar animale: " + gradinaZoo.getNr_animale() + "\n");
        Animal[] a=new Animal[6];
        a[0]= new Panda("Marius", Color.WHITE,2,12);
        a[1]= new Delfin("Rino",Color.GRAY,3,10);
        a[2]= new Pinguin("Kovalski",Color.BLACK,5,100);
        a[3]= new Delfin("Darius",Color.BLUE,6,24);
        a[4]= new Panda("Koaala",Color.DARK_GRAY,1,10);
        a[5]=new Panda("Titi",Color.black,4,20);

        gradinaZoo.addAnimale(a[0],p2);
        gradinaZoo.addAnimale(a[1],p1);
        gradinaZoo.addAnimale(a[2],p4);
        gradinaZoo.addAnimale(a[3],p3);
        gradinaZoo.addAnimale(a[4],p1);
        gradinaZoo.addAnimale(a[5],p2);

        int nr_pinguini, nr_delfini, nr_panda;
        nr_pinguini=gradinaZoo.nrPinguini();
        System.out.println("Numarul de pinguini din gradina sunt: " + nr_pinguini + "\n");

        nr_delfini=gradinaZoo.nrDelfini();
        System.out.println("Numarul de delfini din gradina sunt: " + nr_delfini + "\n");

        nr_panda=gradinaZoo.nrPanda();
        System.out.println("Numarul de panda din gradina sunt: " + nr_panda + "\n");

        gradinaZoo.listAnimale();

        Panda panda1=new Panda("Dorin",Color.DARK_GRAY,6,15);
        int nr_dormite;
        nr_dormite=panda1.doarme(10);
        System.out.println(panda1.getNume() + " a cumulat acum un nr de " + nr_dormite + " ore dormite\n");

        Ingrijitor[] ingrijitor=new Ingrijitor[3];
        ingrijitor[0]=new Ingrijitor("Tudor",22,"delfini");
        ingrijitor[1]=new Ingrijitor("Auras",30,"pinguini");
        ingrijitor[2]=new Ingrijitor("Gabi",20,"panda");

        System.out.println(ingrijitor[0].toString());
        System.out.println(ingrijitor[1].toString());
        System.out.println(ingrijitor[2].toString());


        for(Ingrijitor angajat: ingrijitor){
            if(angajat.getSpecializare().equals("panda")){
                System.out.println(angajat.getNume() + " se ocupa de un numar de "+ nr_panda + " animale");
                for(Animal animal: a){
                    if(animal!=null){
                        if(animal instanceof Panda){
                            System.out.println(angajat.getNume() + " il hraneste pe ursul " + animal.getNume() + " astfel: \n" + angajat.hraneste(animal,p2));
                        }
                    }
                    else
                        break;
                }
            }
            else
            if(angajat.getSpecializare().equals("delfini")){
                System.out.println(angajat.getNume() + " se ocupa de un numar de "+ nr_delfini + " animale");
                for(Animal animal: a){
                    if(animal != null){
                        if(animal instanceof Delfin){
                            System.out.println(angajat.getNume() + " il hraneste pe delfinul " + animal.getNume() + " astfel: \n" +  angajat.hraneste(animal,p1));
                        }

                    }
                    else
                        break;
                }
            }

            else{
                System.out.println(angajat.getNume() + " se ocupa de un numar de "+ nr_pinguini + " animale");
                for(Animal animal: a){
                    if(animal!=null){
                        if(animal instanceof Pinguin)
                            System.out.println(angajat.getNume() + " il hraneste pe pinguinul " + animal.getNume() + " astfel: \n" + angajat.hraneste(animal,p4));
                    }
                    else
                        break;
                }
            }

        }


    }
}
