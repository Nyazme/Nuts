package com.company.model;

public abstract class Nuts {
    String name;
    int weight;
    String sound;

    public Nuts(String name, int weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }
    public void shellNut(){
        System.out.println("The " + this.name + " was shelled with a loud " + this.sound);
    }
}
