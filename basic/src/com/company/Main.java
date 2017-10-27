package com.company;

//import useful utilities
import java.util.*;

public class Main {

    // show the square of a number
    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        Random myRandInt = new Random();

        //declare a variable
        for (int i=0; i<=1000; i++) {
            int randomInt = myRandInt.nextInt(10000000);
            int randomAge = myRandInt.nextInt(40) + 20;
            boolean randomBoolean = myRandInt.nextBoolean();
            //System.out.println("No. Of Packets" + "    " + "On/Off Flag");
            System.out.println(randomInt + "    " + randomBoolean + "    " + randomAge);
        }

        }
}

