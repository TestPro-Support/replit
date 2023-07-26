package com.testpro.java.homework6;

public class JavaClassesAndObjects {
    public static void main(String[] args) {

        System.out.println("Assignment");
    /*
    Homework #6 - Classes and Objects
    1.) Finish up the logic that calculates the balance
    2.) Create a method that withdraws from the balance
    3.) Check when a bank customer deposits $500, $150, $35 and then withdraws $40 and $120, the balance should be correct
    4.) Print out a meaningful message if it is correct or if it is not
    */
        BankingAccount myAccount = new BankingAccount();
        myAccount.deposit(500);
        myAccount.deposit(150);
        myAccount.deposit(35);
        myAccount.withdraw(40);
        myAccount.withdraw(120);
        if (myAccount.balance == 525) {
            System.out.println("The balance is correct and equal to " +myAccount.balance);
        } else {
            System.out.println("The balance is not correct and equal to " +myAccount.balance);
        }
    }
}

class BankingAccount {

    public int balance;

    public void deposit(int amount) {
        balance = balance + amount;
        //or
//      balance += amount;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
        //or
//      balance -= amount;
    }
}