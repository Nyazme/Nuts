package com.company.model;

public class Almond extends Nuts {
    public Almond(String name, int weight, String sound) {
        super(name, weight, sound);
        System.out.println("You now have a Almond!");
    }
}
