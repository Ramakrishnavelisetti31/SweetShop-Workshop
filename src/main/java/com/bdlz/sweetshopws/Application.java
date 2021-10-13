package com.bdlz.sweetshopws;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        System.out.println("Welcome to Sweet Shop Management program");

        Sweet bundharLaddu = new BundharLaddu();
        bundharLaddu.id = "Bl001";
        bundharLaddu.price = 20;

        KakinadaKaja kakinadaKaja = new KakinadaKaja();
        kakinadaKaja.id = "Kk002";
        kakinadaKaja.price= 25;

        Jelibi jelibi = new Jelibi();
        jelibi.id = "j003";
        jelibi.price = 15;

        Kalakhand kalakhand = new Kalakhand();
        kalakhand.id = "k004";
        kalakhand.price = 50;

        Putharekulu putharekulu = new Putharekulu();
        putharekulu.id = "p005";
        putharekulu.price = 100;

        Putharekulu putharekulu1 = new Putharekulu();
        putharekulu1.id = "p005";
        putharekulu1.price = 100;

        SweetRepository sweetRepository = new SweetRepository();
        sweetRepository.add(bundharLaddu);
        sweetRepository.add(kakinadaKaja);
        sweetRepository.add(jelibi);
        sweetRepository.add(kalakhand);
        sweetRepository.add(putharekulu);
        sweetRepository.add(putharekulu1);


        UserInterface userInterface = new UserInterface();
        Set sweetSet = sweetRepository.getSweetList();

        userInterface.print(sweetSet);
        System.out.println("\nPrinting IDietSweet\n");
        userInterface.printDietSweets(sweetSet);
        System.out.println("\nPrinting INormalSweet\n");
        userInterface.printNormalSweets(sweetSet);
        sweetRepository.delete(bundharLaddu);
        sweetRepository.delete(kalakhand);
        sweetRepository.delete(kakinadaKaja);
        System.out.println("\nPrinting after remove the sweet\n");
        userInterface.print(sweetSet);

    }
}
