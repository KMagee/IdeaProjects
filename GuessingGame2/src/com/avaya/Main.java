package com.avaya;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Generate a random number (0-9) for the user to guess in five tries.
        Random myRandInt = new Random(); //instance of class Random
        int randomInt = myRandInt.nextInt(10); //declare random int
        System.out.println(randomInt); //for testing print the random int

        System.out.println("Please Enter A Number:"); //ask for input

        //User Input Variables
        Scanner userInput = new Scanner(System.in); // instance of the class Scanner



        //Begin Loop
        for (int i=0; i<5; i++) {
            int myInt = userInput.nextInt();
            if (myInt == randomInt)
            {System.out.println(randomInt + "=" + myInt + " CONGRATS YOU WIN!!");
             System.out.println("It Took You " + (i + 1) + " Attempts");
            break;}
            else if (myInt < randomInt)
            { System.out.println("YOU GUESSED " + myInt + " THAT'S TOO LOW, TRY AGAIN!!");}
            else if(myInt > randomInt) {System.out.println("YOU GUESSED " + myInt + " THAT'S TOO HIGH, TRY AGAIN!!");}
        }
    }
}
