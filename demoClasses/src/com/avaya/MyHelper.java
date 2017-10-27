package com.avaya;

import java.util.Date;

public class MyHelper {

    public static void displayDateTime(){ //function/method/public-available outside the class / void -returns nothing no data type

        //display current date and time
        System.out.println("Date is " + new Date());
        /*return "datatype"
        return does not mean print line, the function writes the string inside itself, not returning anything
        java.util.date returns the date on the computer that the code is on
        helper classes usually contain more than 1 method
        static method belongs to a class, non-static belongs to an instance
        */
    }
}
