package com.gabi.rechizita;

public class Ghiozdan {
    private  Rechizita[] rechizite= new Rechizita[10];
    private int contor=0;

    public void add(Rechizita x){
        rechizite[contor++] = x;
    }

    public void listItems(){
        for (Rechizita x: rechizite) {
            //ca sa mergem numai pana la toate rechizitele adaugate
            if(x!=null)
                 System.out.println(x.getNume());
            else
                break;
        }
    }

    public void listManuals(){
        for(Rechizita x:rechizite){
            if(x==null)
                break;
            if(x instanceof Manual)
                System.out.println(x.getNume());
        }
    }

    public void listCaiete(){
        for(Rechizita x:rechizite){
            if(x==null)
                break;
            if(x instanceof Caiet)
                System.out.println(x.getNume());
        }
    }

    public int getNrRechizite(){
        int count=0;
        for(Rechizita x:rechizite)
        {
            if(x !=null)
                count++;
            else
                break;
        }
        return count;
    }

    public int getNrCaiete(){
        int count=0;
        for(Rechizita x:rechizite)
        {
            if(x instanceof Caiet)
                count++;
            if(x == null)
                break;
        }
        return count;
    }

    public int getNrManuale(){
        int count=0;
        for(Rechizita x:rechizite)
        {
            if(x instanceof Manual)
                count++;
            if(x == null)
                break;
        }
        return count;
    }
}
