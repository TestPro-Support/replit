package com.testpro.java.homework9;

public class JavaArrays {
    public static void main(String[] args) {
    /*
    Assignment #1 - Printing the largest element in an array
    1. Find the largest value of an array of integers by using a for loop.
    2. Print the largest value in the console.
    */
        int[] firstAssignmentArray = {2, 3, 4, 5, 56, 5, 43, 3};
        int maxValue = 0;

        for (int i = 1; i < firstAssignmentArray.length; i++) {
            if (firstAssignmentArray[i] > maxValue) {
                maxValue = firstAssignmentArray[i];
            }
        }
        System.out.println("Largest value: " + maxValue);
    /*
    Assignment #2 - Print out all elements of the two-dimensional (2D) array
    1. Create 2 for loops to access each element of array one by one
    2. Print the values of the array in the console
    */
        int[][] secondAssignmentArray = {{2, 3, 4, 5, 56, 5, 43, 3}, {2, 3, 4, 5, 65, 5, 43, 3}};

        System.out.println("Assignment #2 - Elements of the 2D array:");
        for (int i = 0; i < secondAssignmentArray.length; i++) {
            for (int j = 0; j < secondAssignmentArray[i].length; j++) {
                System.out.print(secondAssignmentArray[i][j] + " ");
            }
       //optional
       System.out.println(); // Move to the next line for the next row

        }
    }
}