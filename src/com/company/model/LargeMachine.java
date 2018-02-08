package com.company.model;

public class LargeMachine extends CrackingMachine{
    public LargeMachine() {
    }

    @Override
    public void sorting(Nuts nuts) {
        if(nuts.weight>5){
            System.out.println("The Large Nut machine will start now...");
            nuts.shellNut();
             } else {
            System.out.println(("Sorry this nut is too small for this machine."));
        }
    }

    @Override
    public void shelling() {

    }
}

