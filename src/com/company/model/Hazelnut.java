package com.company.model;

public class Hazelnut extends Nuts{
    public Hazelnut(String name, int weight, String sound) {
        super(name, weight, sound);
        System.out.println("You now have a Hazelnut!");
    }
}
