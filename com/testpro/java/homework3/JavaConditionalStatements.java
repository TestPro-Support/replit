package com.testpro.java.homework3;

public class JavaConditionalStatements {
    public static void main(String[] args) {
    /*
    Homework #3 - Conditional Statements

    Assignment #1
    1.) Declare an int variable with the value of 75 (any variable name would do)
    2.) Write an if/else statement to check and if our int variable is an even or
    odd number (using modulo/remainder operator %)
    3.) If our int variable is even, print out "It's an even number", otherwise
    "It's an odd number".
    4.) Next, let's change our int variable value to 346 (an even number), and
    the output should be correct.

    - Congratulations on your first simplified Unit Test! (this is how we test our own
    code
    */
        System.out.println("Assignment #1");
        int number = 346;
        if (number % 2 == 0) {
            System.out.println("It's an even number");
        }
        else {
            System.out.println("It's an odd number");
        }

    /*
    Assignment #2
    1.) Declare an int variable named 'day', with the value of 1
    Example: int day = 1;
    2.) Write a switch case statement to determine the day of the week based on
    our int variable value
    3.) If the value of our int variable is 1, print out "It's Sunday", when the
    value of our int variable is 2, it should print "It's Monday" and so on
    4.) Next, let's change the value of the int variable to 6, and it should
    print out the correct result
    Example: ("Its Friday")
    */

        System.out.println("Assignment #2");
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Friday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("Invalid input or day number");
                break;
        }

    /*
    OPTIONAL HOMEWORK ONLY

    Instructions:
    1.) For our optional homework (not required), let's try and create a homework
    grading system.
    2.) Declare an int variable named grade, with a value of 80
    Example: int grade = 80;
    3.) Next, let's create an if - else - if statement, which would check the
    value of our int variable grade.
    4.) Using our Comparison & Logical Operators (from the lesson) in the if else
    if statements, when our grade ranges 90-100, print out "Excellent! Your
    homework grade is A!"
    5.) Next condition, when our grade ranges 80-89, print out "Great work! Your
    homework grade is B!"
    6.) Next condition, when our grade ranges 70-79, print out "Improvement
    needed! Your homework grade is C!"
    7.) Next condition, when our grade ranges 60-69, print out "Close fail, try
    harder! Your homework grade is D!"
    8.) Next condition, when our grade ranges 0-59, print out "Sorry, failed,
    let's try again! Your homework grade is F!"
    9.) For our else statement, if the grade value is not within the grade
    conditions, print "Invalid homework grade!"
    10.) Let's change the int grade value and try out each of the conditions for the homework grade A-F, and the else statement
    */
        System.out.println("Optional Homework");
        int grade = 80;
        if (grade >= 90 && grade <= 100) {
            System.out.println("Excellent! Your homework grade is A!");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Great work! Your homework grade is B!");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Improvement needed! Your homework grade is C!");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Close fail, try harder! Your homework grade is D!");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("Sorry, failed, let's try again! Your homework grade is F!");
        } else {
            // Step 9: For our else statement, if the grade value is not within the grade conditions, print "Invalid homework grade!"
            System.out.println("Invalid homework grade!");
        }

    }
}