package com.testpro.java.homework4;

public class JavaLoops {
    public static void main(String[] args) {
    /*
      Homework #4 - Loops
     * Assignment #1
     * 1.) Create a for loop that prints all the even numbers from numbers 1 to 10
     *
     * Hint:
     * - A total of 5 numbers should be printed
     */

        System.out.println("Assignment #1");
        // Write the missing part here

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    /*
     * OPTIONAL HOMEWORK ONLY
     * Instructions:
     * 1.) For our optional homework (not required), write an application using
     * nested loops to print out a Multiplication table of numbers 1 - 12
     *
     * Hints:
     * - Start with the first loop
     * - To print numbers in one line use System.out.print(variable) method
     * - To break the line and start a new one - use System.out.println() without
     * any parameters
     *
     * Sample Output:
     * 1 2 3 4 5 6 7 8 9 10 11 12
     * 2 4 6 8 10 12 14 16 18 20 22 24
     * 3 6 9 12 15 18 21 24 27 30 33 36
     * 4 8 12 16 20 24 28 32 36 40 44 48
     * 5 10 15 20 25 30 35 40 45 50 55 60
     * 6 12 18 24 30 36 42 48 54 60 66 72
     * 7 14 21 28 35 42 49 56 63 70 77 84
     * 8 16 24 32 40 48 56 64 72 80 88 96
     * 9 18 27 36 45 54 63 72 81 90 99 108
     * 10 20 30 40 50 60 70 80 90 100 110 120
     * 11 22 33 44 55 66 77 88 99 110 121 132
     * 12 24 36 48 60 72 84 96 108 120 132 144
    */

        for (int i = 1; i <= 12; i++) {
            System.out.println();
            for (int j = 1; j <= 12; j++) {
                System.out.print((i * j) + " ");
            }
         }
    }
}
