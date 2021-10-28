package com.bdlz.sweetshopws;

import java.util.Scanner;
import java.util.Set;

public class Application {

    public void handleUserSelection(int choice) {
      SweetRepository sweetRepository = SweetRepository.getInstance();
      UserInterface userInterface =  UserInterface.getInstance();
        Set sweetSet = sweetRepository.getSweetList();
        switch (choice) {
            case 1:
                addSweet();
                break;
            case 2:
                removeSweet();
                break;
            case 3:
                editSweet();
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
            default:
                System.out.println("Entered incorrect choice, please enter correct choice!... ");
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

        SweetRepository sweetRepository = SweetRepository.getInstance();
        sweetRepository.add(bundharLaddu);
        sweetRepository.add(kakinadaKaja);
        sweetRepository.add(jelibi);
        sweetRepository.add(kalakhand);
        sweetRepository.add(putharekulu);
        sweetRepository.add(putharekulu1);
    }

    public void editSweet() {
        SweetRepository sweetRepository = SweetRepository.getInstance();
        System.out.println("Enter which sweet you want to edit");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.next();
        Sweet sweet = sweetRepository.getSweet(editName);
        System.out.println("Enter\n 1. To change Name\n 2. To change Colour\n " +
                "3. To change Category\n 4. To change Price\n 5. To change Id");
        int edit = scanner.nextInt();
        switch (edit) {
            case 1:
                System.out.println("Enter new Sweet name");
                String newSweetName = scanner.next();
                sweet.name = newSweetName;
            case 2:
                System.out.println("Enter for colour \n 1. for YELLOW\n 2. for RED\n 3. for WHITE\n 4. for BROWN");
                int colour = scanner.nextInt();
                switch (colour) {
                    case 1:
                        sweet.colour = Sweet.Colour.YELLOW;
                        break;
                    case 2:
                        sweet.colour = Sweet.Colour.RED;
                        break;
                    case 3:
                        sweet.colour = Sweet.Colour.WHITE;
                        break;
                    case 4:
                        sweet.colour = Sweet.Colour.BROWN;
                        break;
                    default:
                        System.out.println("Entered incorrect choice, please enter correct choice!... ");
                }
            case 3:
                System.out.println("Enter for category\n 1. for SUGAR\n 2. for SUGAR_LESS\n 3. for GHEE\n 4. for JAGGERY");
                int category = scanner.nextInt();
                switch (category) {
                    case 1:
                        sweet.category = Sweet.Category.GHEE;
                        break;
                    case 2:
                        sweet.category = Sweet.Category.SUGAR_LESS;
                        break;
                    case 3:
                        sweet.category = Sweet.Category.SUGAR;
                        break;
                    case 4:
                        sweet.category = Sweet.Category.JAGGERY;
                        break;
                    default:
                        System.out.println("Entered incorrect choice, please enter correct choice!... ");
                }
            case 4:
                System.out.println("Enter new Price");
                int newPrice = scanner.nextInt();
                sweet.price = newPrice;
            case 5:
                System.out.println("Enter new Id");
                String newId = scanner.next();
                sweet.id = newId;
                break;
            default:
                System.out.println("Entered incorrect choice, please enter correct choice!... ");
                break;
        }
    }

    public void removeSweet() {
        SweetRepository sweetRepository = SweetRepository.getInstance();
        System.out.println("Enter which sweet you want to delete");
        Scanner scanner = new Scanner(System.in);
        String sweetName = scanner.next();
        Sweet sweet = sweetRepository.getSweet(sweetName);
        sweetRepository.delete(sweet);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Sweet Shop Management program");
        Application application = new Application();
        UserInterface userInterface = UserInterface.getInstance();
        while (true) {
            int choice = userInterface.showUserMenu();
            if (choice != 0) {
                application.handleUserSelection(choice);
            } else {
                break;
            }
        }
        System.out.println("Good Bye!......");
    }
}

