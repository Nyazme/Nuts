package com.company.model;

public class SmallMachine extends CrackingMachine    {
    public SmallMachine() {

    }

    @Override
    public void sorting(Nuts nuts) {
        if(nuts.weight<6){
            System.out.println("The Small Nut machine will start now...");
            nuts.shellNut();
        } else {
            System.out.println(("Sorry this nut is too large for this machine."));
        }

    }

    @Override
    public void shelling() {

    }
}
