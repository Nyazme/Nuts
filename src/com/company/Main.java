package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Nut Shelling Factory!");
        System.out.println("Would you like to sort some nuts? (Yes/No");
        String sortNuts = sc.nextLine();
        if (sortNuts.equalsIgnoreCase ("yes")){
            System.out.println("Great! Let's pick some nuts for you...");
        } else {
            System.out.println("Okay, have a nice day!");
            System.exit(0);
        }
        //code block to pause for dramatic effect :)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException pause) {
            pause.printStackTrace();
        }

        //creation statements for the nuts
       LargeMachine largeMachine = new LargeMachine();
        SmallMachine smallMachine = new SmallMachine();
        Peanut peanut = new Peanut("Peanut", 3, "Crunchhhh!");
        Walnut walnut = new Walnut("Walnut", 8, "Crrrackkkk!");
        Pecan pecan = new Pecan("Pecan", 5, "Ka-Crack!");
        Almond almond = new Almond("Almond", 4, "CaaaaCrunch!");
        Hazelnut hazelnut = new Hazelnut("Hazelnut", 7, "CrinkleKa!");

        System.out.println("Now I'll put the nuts in the Large Machine...");
        largeMachine.sorting(peanut);
        largeMachine.sorting(walnut);
        largeMachine.sorting(pecan);
        largeMachine.sorting(almond);
        largeMachine.sorting(hazelnut);
        System.out.println("");

        System.out.println("Now I'll put the nuts in the Small Machine...");
        smallMachine.sorting(peanut);
        smallMachine.sorting(walnut);
        smallMachine.sorting(pecan);
        smallMachine.sorting(almond);
        smallMachine.sorting(hazelnut);
        System.out.println("");

       // System.out.println();
    }



}


// write your code here
//create two different types of classes that we will call 'cracking machines'
//smaller nuts v. larger nuts
//use an abstract class for the two machine subclasses to inherit from.
//Both machines should check a property of the shelled nut
//then be returned back to the main class to be given to the other machine to shell.
//The nuts should all use an interface or abstract class for members and methods assoc.
//Nut name, weight, and String sound made when cracked
//Create a total of 5 shelled nut varieties for the two machines to crack open.
//rest of the specifications of the application are up to your interpretation and design.
//ensure that you instance one of each shelled nut, and pass them to the two machines for processing.
//ensure to display to the user which shelled nut was cracked open in each machine Crrrrush!!!!
