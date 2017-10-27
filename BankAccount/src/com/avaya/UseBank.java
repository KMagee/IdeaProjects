package com.avaya;

//need the main method as this main class i.e. the entry point to the program

public class UseBank {

    public static void main(String[] args)
    {
        //create a bank account
        Main account1 = new Main(); //main = bank account
        account1.setAccountHolder("Ada");
        //System.out.println(account1.getAccountHolder());

        //Make a deposit
        account1.deposit(50);
        System.out.println(account1.getBalance());

        //Make another deposit
        account1.deposit(5,5);
        System.out.println(account1.getBalance());


        //Make a withdrawal
        account1.withdraw(25);
        System.out.println(account1.getBalance());


        //check the balance
        System.out.println(account1.getBalance());


        //overdraw
        account1.withdraw(1000);
       System.out.println(account1.getBalance());

    }

}
