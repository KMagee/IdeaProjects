package com.avaya;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10);

        int guess = 0;

        //loop
        while(true)

        {
            for (int i=0;i<5;i++)

            {

                System.out.println(numberToGuess);
                System.out.println("Guess a number");
                guess = userInput.nextInt();

                if (guess > numberToGuess)
                    System.out.println("You guessed " + guess + " Too high");
                else if (guess < numberToGuess)
                    System.out.println("You guessed " + guess + " Too Low");
                else{
                    System.out.println(guess + " = " + numberToGuess + " " + "Congrats, You Won, It Took you " + (i+1) + " guesses");
                    break;

                }
            }

            if(guess==numberToGuess)
                break;


            if (guess!=numberToGuess)
                System.out.println("You Lose, would you like to play again?");
            String answer= userInput.next();

            if (!answer.equals("Y"))
                break;}
    }
}
