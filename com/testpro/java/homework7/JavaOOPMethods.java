package com.testpro.java.homework7;

public class JavaOOPMethods {
    public static void main(String[] args) {
    /*
    Homework #7 - OOP Methods

    Instructions:
    1.) Create a Java class named 'CreditCard'
    2.) Declare an int variable named 'currentBalance'
    3.) Declare a String variable named 'type'
    4.) Create a Java constructor which takes a String parameter named 'creditCardType'.
        Example: CreditCard (String creditCardType)
    5.) Inside the constructor, initialize the value of the String 'type' to the constructor parameter
    6.) Create a method named getBalance() which will print the current credit card balance
    7.) Create a method named makePurchase(int sum) which takes an int parameter named 'sum' which will update the value of int 'currentBalance'
    8.) Inside the main method, create an object of the CreditCard class with any credit card name. Example: Visa
    9.) Using the object of the CreditCard class, call the makePurchase method and make a purchase of 50$
    10.) Call the getBalance() method and verify it will return 50$ as its balance

    Additional Exercise:
    1.) Create a static method in the CreditCard class which prints the following output "Static method of Credit Card Class"
    2.) Call the static method inside the main method and verify that it will print the said output
    */

        System.out.println("Assignment");
        CreditCard myCreditCard = new CreditCard("Visa");
        myCreditCard.makePurchase(50);
        myCreditCard.getBalance();
        CreditCard.staticMethod();
    }
}

class CreditCard {
    private int currentBalance;
    private String type;
    public CreditCard(String creditCardType) {
        type = creditCardType;
    }
    public void getBalance() {
        System.out.println("$" + currentBalance);
    }
    public void makePurchase(int sum) {
        currentBalance = currentBalance + sum;
        //or
        //currentBalance += sum;
    }
    public static void staticMethod() {
        System.out.println("Static method of Credit Card Class");
    }
}