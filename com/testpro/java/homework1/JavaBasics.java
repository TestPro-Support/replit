package com.testpro.java.homework1;
public class JavaBasics {
    public static void main(String[] args) {
        /*
    Homework #1 - Primitives
    Write a simple Java application to finish the assignments below

    Assignment #1
    1.) Print your name
    */
        System.out.println("Assignment #1");
        System.out.println("Czar");

    /*
    Assignment #2
    1.) Declare an int variable named 'bookPrice' equal to $45
    Example: int bookPrice = 45;
    2.) Declare a double variable named 'discount' equal to 20% in decimal format
    3.) Declare a double variable named 'total' that will calculate the discounted price of the book
    4.) Print out the result of total due by a customer when purchasing a book that costs $45 with a 20% discount
    */
        System.out.println("Assignment #2");

        int bookPrice = 45;
        double discount = 0.2;
        double total = bookPrice - bookPrice * discount;
        System.out.println(total);


    /*
    Assignment #3
    1.) Convert 90 degrees Fahrenheit to Celsius
    2.) Use the following formula: C = (F − 32) × 5/9) to calculate it
    3.) Print out the Celsius convertion without declaring any variables
    */
        System.out.println("Assignment #3");
        System.out.println((90-32)*5/9);
    }
}
