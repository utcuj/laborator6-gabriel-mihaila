package com.gabi.zoo;
import java.lang.String;

public class Mancare {
    private Preparat[] mancare = new Preparat[10];
    private int i=0;

    //metode
    public void addPreparat(Preparat preparat){
        mancare[i++] = preparat;
    }

    public void sortMancare(){ //se sorteaza mancarea dupa cantitate
        int gata=0;
        while(gata==0){
            gata=1;
            for(int ct=0;ct<i-1;ct++){

                if(mancare[ct].getCantitate() > mancare[ct+1].getCantitate()){
                    Preparat aux=mancare[ct];
                    mancare[ct]=mancare[ct+1];
                    mancare[ct+1]=aux;
                    gata=0;
                }
            }


        }
    }

    public void sortMancareByName(){
        int gata=0;
        while(gata==0){
            gata=1;
            for(int ct=0;ct<i-1;ct++){
                int len1,len2,min,ok;

                ok=-1;
                len1=mancare[ct].getNume().length();
                len2=mancare[ct+1].getNume().length();
               // System.out.println(len1 +" "+ len2);
                min=Math.min(len1,len2);
                for(int j=0;j<min;j++){
                    int str1_ch=(int) mancare[ct].getNume().charAt(j);
                    int str2_ch=(int) mancare[ct+1].getNume().charAt(j);
                    if (str1_ch > str2_ch) {
                        ok = 0;
                        break;
                    }
                    else
                        if(str1_ch < str2_ch){
                            ok=1;
                            break;
                        }

                }

                if(ok == -1 && len1 > len2)
                    ok = 0;

                if(ok == 0){
                    Preparat aux=mancare[ct];
                    mancare[ct]=mancare[ct+1];
                    mancare[ct+1]=aux;
                    gata=0;
                }
            }
        }
    }

    public void listMancare(){
        for(Preparat preparat : mancare){
            if(preparat!=null)
                System.out.println(preparat.toString());
            else
                break;
        }
    }

    public void listMancareByFor(){
        for(int ct=0;ct<i;ct++)
            System.out.println(mancare[ct].toString());
    }

    public Preparat[] getMancare() {
        return mancare;
    }

    public void setMancare(Preparat[] mancare) {
        this.mancare = mancare;
    }

}
