package com.bdlz.sweetshopws;

import java.util.List;
import java.util.Set;

public class UserInterface {
  public void print(Set<Sweet> set) {
      for (Sweet sweet : set ){
          System.out.println(sweet);
      }
    }
}
