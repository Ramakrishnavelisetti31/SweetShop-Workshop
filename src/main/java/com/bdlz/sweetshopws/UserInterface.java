package com.bdlz.sweetshopws;

import java.util.List;
import java.util.Set;

public class UserInterface implements IDietSweets, INormalSweets{

  public void print(Set<Sweet> set) {
      for (Sweet sweet : set ){
          System.out.println(sweet);
      }
    }

    public void printDietSweets(Set<Sweet> set) {
        for (Sweet sweet : set ){
            if (sweet instanceof IDietSweets) {
                System.out.println(sweet);
            }
        }
    }
    public void printNormalSweets(Set<Sweet> set) {
        for (Sweet sweet : set ){
            if (sweet instanceof INormalSweets) {
                System.out.println(sweet);
            }
        }
    }
}
