package com.testpro.java.homework11;

import java.util.*;

public class JavaSetsAndMaps {
    public static void main(String[] args) {

        /*
        Homework #11 - Sets & Maps
        Sets:
        1.) We had the students from the following countries in cohort #1 of the bootcamp: United States, United States, Ukraine, Mexico
        2.) In cohort #2 we had the following countries: United States, Canada, United States, Mexico
        3.) Print out the list of all unique countries of every cohort separately (order doesn't matter)
        4.) Print out all unique countries from all cohorts in one line (order doesn't matter)
        5.) Print out all unique countries from all cohorts in alphabetical order
        6.) Print out the common countries from both cohorts
        */
        System.out.println("Sets Assignment");
        Set<String> cohort1 = new HashSet<>();
        cohort1.add("United States");
        cohort1.add("United States");
        cohort1.add("Ukraine");
        cohort1.add("Mexico");
        System.out.println("Cohort1 Unique Set: " + cohort1);

        Set<String> cohort2 = new HashSet<>();
        cohort2.add("United States");
        cohort2.add("Canada");
        cohort2.add("United States");
        cohort2.add("Mexico");
        System.out.println("Cohort2 Unique Set: " + cohort2);

        Set<String> cohortUniqueList = new HashSet<>();
        cohortUniqueList.addAll(cohort1);
        cohortUniqueList.addAll(cohort2);
        System.out.println("Cohort1 & Cohort2: " + cohortUniqueList);

        Set<String> cohortAlphabeticalOrder = new TreeSet<>(cohortUniqueList);;
        System.out.println("All unique countries in alphabetical order: " + cohortAlphabeticalOrder);

        cohort1.retainAll(cohort2);
        System.out.println("Common countries in Cohort1 & Cohort2 Sets: " + cohort1);

        /*
        Maps:
        1.) Declare a HashMap with Integer values for Street Numbers & String values for Names:
        2.) (1000, Liam), (1001, Noah), (1002, Olivia), (1003, Emma), (1004, Benjamin), (1005, Evelyn), (1006, Lucas)
        3.) Find the name of the person who lives at 1004 based on the street number
        4.) Next, print out all the odd number streets and their corresponding names
        */
        System.out.println("Maps Assignment");
        Map<Integer, String> streetNumberAndNames = new HashMap<>();
        streetNumberAndNames.put(1000, "Liam");
        streetNumberAndNames.put(1001, "Noah");
        streetNumberAndNames.put(1002, "Olivia");
        streetNumberAndNames.put(1003, "Emma");
        streetNumberAndNames.put(1004, "Benjamin");
        streetNumberAndNames.put(1005, "Evelyn");
        streetNumberAndNames.put(1006, "Lucas");

        System.out.println(streetNumberAndNames.get(1004));

        for(int num: streetNumberAndNames.keySet()) {
            if(num % 2 != 0){
                System.out.println("Street Number: " +num+ " | Name: " +streetNumberAndNames.get(num));
                }
          }
     }
}
