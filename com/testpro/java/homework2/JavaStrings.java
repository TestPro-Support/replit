package com.testpro.java.homework2;

public class JavaStrings {
    public static void main(String[] args) {

    /*
    Homework #2 - Strings
    Write a Java simple application to finish the assignments below

    Assignment #1
    1.) Declare a String variable 'phrase' with the following phrase/texts "I never dreamed about success. I worked for it"
    2.) Print out the number of characters in that quote
    */
        System.out.println("Assignment #1");
        String phrase = "I never dreamed about success. I worked for it";
        System.out.println(phrase.length());

    /*
    Assignment #2
    1.) Declare a String variable 'name' with a value of "Estee Lauder"
    2.) Declare a String variable 'quote', with the value of the String variable 'name', a dash and the String variable 'phrase' from Assignment #1
    3.) Print out the whole quote
    - Print out first 12 characters of the phrase
    */
        System.out.println("Assignment #2");
        String name = "Estee Lauder";
        String quote = name + " " + phrase;
        System.out.println(quote);
        System.out.println(quote.substring(0,12));

    /*
    Assignment #3
    1.) Print out the result of comparison of the following strings: "0CT0PUS" and "0CT0PUS" using the String equals() method
    2.) Print out if they are equal or not equal, and explain why (they are equal or not)
    */
        System.out.println("Assignment #3");
        System.out.println("0CT0PUS".equals("0CT0PUS"));
        System.out.println("It is true/equal because it is a String and we compared them using a String method");

    }
}
