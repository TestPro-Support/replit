package com.testpro.java.homework10;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayLists {

    public static void main(String[] args) {
        /*
        Homework #10 - ArrayLists
        Instructions:
        1.) Declare ArrayList of Integers #1 with values: -2, -3, 6, 3
        2.) Declare ArrayList of Integers #2 with values: -2, -4, 5, -3
        3.) Declare ArrayList of ArrayLists of Integers #3
        4.) Include ArrayLists #1 and #2 into the #3
        5.) Find the minimum value of ArrayList #3 and print it to the console
        */
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(-2);
        arrayList1.add(-3);
        arrayList1.add(6);
        arrayList1.add(3);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(-2);
        arrayList2.add(-4);
        arrayList2.add(5);
        arrayList2.add(-3);

        List<Integer> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);

        System.out.println(arrayList3);
    }
}

