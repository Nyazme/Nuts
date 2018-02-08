package com.company.model;

public class Walnut extends Nuts {
    public Walnut(String name, int weight, String sound) {
        super(name, weight, sound);
        System.out.println("You now have a Walnut!");
    }
}
