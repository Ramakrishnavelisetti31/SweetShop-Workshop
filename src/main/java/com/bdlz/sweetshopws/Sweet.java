package com.bdlz.sweetshopws;

public class Sweet {
    enum Colour {
        YELLOW, RED, WHITE, BROWN;
    }

    enum Category {
        SUGAR, SUGAR_LESS, GHEE,JAGGERY;
    }
    String name;
    Colour colour;
    Category category;
    int price;
    String id;

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", category=" + category +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
