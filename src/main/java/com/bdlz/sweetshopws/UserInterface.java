package com.bdlz.sweetshopws;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    private static UserInterface instance;
    private UserInterface() {

    }

    public static synchronized UserInterface getInstance() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    public int showUserMenu() {
        System.out.println("Enter \n 1. To Add Sweets\n 2. To Remove Sweets\n 3. To Edit Sweets\n " +
                      "4. To Print All Sweets\n 5. To Print Diet Sweets\n 6. To Print Normal Sweets\n " +
                      "0. To Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

  public void print(Set<Sweet> set) {
      for (Sweet sweet : set ){
          System.out.println(sweet);
      }
    }

    public void printDietSweets(Set<Sweet> set) {
        for (Sweet sweet : set ){
            if (sweet.propertyType == Sweet.PropertyType.DIET) {
                System.out.println(sweet);
            }
        }
    }
    public void printNormalSweets(Set<Sweet> set) {
        for (Sweet sweet : set ){
            if (sweet.propertyType == Sweet.PropertyType.NORMAL) {
                System.out.println(sweet);
            }
        }
    }
}
