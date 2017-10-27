package com.avaya;

public class Main {
        //properties
        private String accountHolder;
        private String accountNumber;
        private String type;
        private double balance;
    //if not specified, properties are implicitly public
    //private -- only available inside the class. when the props are private, you need to make available ways of getting and changing the props outside the class
    //setters/getters - in real world, getters and setters used to enforce security etc, not just anyone can access the data
    //public static void main{} usually only needed in the main/entry point

   //accountHolder Getter and Setters
    public void setAccountHolder(String newHolderName){

        this.accountHolder = newHolderName;
        //setting new account name

        }

     public String getAccountHolder(){
        return accountHolder;
     }

    //accountNumber Getter and Setters

    public void setAccountNumber(String newNumber){

        this.accountNumber = newNumber;
        //setting new account name

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    //type Getter and Setters

    public void setType(String newType){

        this.type = newType;
        //setting new account name

    }

    public String getType(){
        return type;
    }

    //balance Getter and Setters

    public void setBalance(Double newBalance){

        this.balance = newBalance;
        //setting new account name

    }

    public Double getBalance(){
        return balance;
    }

    //methods to manipulate the account balance
    public double withdraw(double amount) {
      //are there enough funds for this withdrawal
      double checkIfOk = balance - amount;
      if(checkIfOk < 0){
          System.err.println("Not Enough Funds");
      } else {
          //the new balance after withdrawal
          balance = checkIfOk;
      }
        return balance;

    }

    public double deposit(double amount){ //one argument signature

        return balance += amount;
    }

    public double deposit(double euro, double cents){ //two argument signature

        double amount = euro + cents/100; //DRY -- dont repeat yourself
        return this.deposit(amount); //call the one argument method

    }

}
