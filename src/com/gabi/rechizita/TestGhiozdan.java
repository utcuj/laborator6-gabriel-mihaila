package com.gabi.rechizita;

public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan ghiozdan= new Ghiozdan();

        Caiet caiet1= new Caiet("matematica");
        Caiet caiet2= new Caiet("romana");
        Manual manual1= new Manual("engleza");
        Manual manual2= new Manual("matematica");
        Caiet caiet3= new Caiet("engleza");
        Caiet necunoscut=new Caiet();

        ghiozdan.add(caiet1);
        ghiozdan.add(caiet2);
        ghiozdan.add(caiet3);
        ghiozdan.add(manual1);
        ghiozdan.add(manual2);

        ghiozdan.listItems();

        System.out.println("Manuale:");
        ghiozdan.listManuals();
        System.out.println("Caiete:");
        ghiozdan.listCaiete();

        System.out.println("Nr rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr manuale: " + ghiozdan.getNrManuale());
        System.out.println("Nr caiete: " + ghiozdan.getNrCaiete());

        System.out.println(necunoscut.getNume());

    }
}
