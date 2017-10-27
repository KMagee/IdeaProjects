package com.avaya;


import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;
import ;

public class Main {

    public static void main(String[] args) {

        //begin a Loop
        for(int iterator=0;iterator<100;iterator++) {
            // ask the user for input
            Scanner myInput = new Scanner(System.in);
            //grab the next character the user types
            String chr = myInput.next();
            // check did they type "q"?

            //if so, we are done, so end the program
            if (chr.equals("q")){
               break; //this quits a loop
            } else {

                //other wise, print what they typed
                System.out.println(chr);
            }
            //Loop back to the top
        }
    }
}
