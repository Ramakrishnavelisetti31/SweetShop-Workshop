package com.bdlz.sweetshopws;

import java.util.Set;

public class Application {

    SweetRepository sweetRepository = SweetRepository.getInstance();
    UserInterface userInterface = UserInterface.getInstance();

    public void handleUserSelection(int choice) {
        Set sweetSet = sweetRepository.getSweetList();
        switch (choice) {
            case 1:
                addSweet();
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                userInterface.print(sweetSet);
                break;
            case 5:
                System.out.println("\nPrinting IDietSweet\n");
                userInterface.printDietSweets(sweetSet);
                break;
            case 6:
                System.out.println("\nPrinting INormalSweet\n");
                userInterface.printNormalSweets(sweetSet);
                break;
            case 7:
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }

    public void addSweet() {
        Sweet bundharLaddu = new BundharLaddu();
        bundharLaddu.id = "Bl001";
        bundharLaddu.price = 20;

        Sweet kakinadaKaja = new KakinadaKaja();
        kakinadaKaja.id = "Kk002";
        kakinadaKaja.price = 25;

        Sweet jelibi = new Jelibi();
        jelibi.id = "j003";
        jelibi.price = 15;

        Sweet kalakhand = new Kalakhand();
        kalakhand.id = "k004";
        kalakhand.price = 50;

        Sweet putharekulu = new Putharekulu();
        putharekulu.id = "p005";
        putharekulu.price = 100;

        Sweet putharekulu1 = new Putharekulu();
        putharekulu1.id = "p005";
        putharekulu1.price = 100;

        sweetRepository.add(bundharLaddu);
        sweetRepository.add(kakinadaKaja);
        sweetRepository.add(jelibi);
        sweetRepository.add(kalakhand);
        sweetRepository.add(putharekulu);
        sweetRepository.add(putharekulu1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Sweet Shop Management program");
        Application application = new Application();
        while (true) {
            int choice = application.userInterface.showUserMenu();
            if (choice != 0) {
                application.handleUserSelection(choice);
            } else {
                break;
            }
        }
        System.out.println("Good Bye!......");
    }
}

