package com.testpro.java.homework8;

public class JavaOOPPrinciples {
    public static void main(String[] args) {

    /*
    Homework #8 - OOP Principles

    Instructions:
    1.) Create a new java class named BaseElement for the web elements, it will be our base class.
    2.) Create two new java classes named LinkElement and TextElement, these two classes should inherit the BaseElement class.
    Example: class LinkElement extends BaseElement
    3.) Declare a String variable named locator with value of "//*[id='some-id']" in BaseElement class, so it will be inherited by the 2 classes.
    4.) Create a method named click() in both the LinkElement and TextElement classes.
    5.) Inside the click() methods of both classes, print the locator string variable inherited from the BaseElement class.
    6.) Inside the click() method of the TextElement class, print the message "clicked on an element". This message will be true for text type elements.
    7.) While for the LinkElement class, when clicking on a link - we must get redirected to some other page, so in this case please print out: "clicked and redirected".
    8.) This is a simplified version of a framework structure that will be covered in detail when we start Selenium.
    9.) In our Main.java class, create objects for the LinkElement and TextElement classes.
    10.) Call the click() methods for both classes, what principle is that?
    11.) It should also print out both locators, what was displayed in our console? What OOP principle is that?
    */

        System.out.println("Assignment");

        TextElement textElement = new TextElement();
        LinkElement linkElement = new LinkElement();

        textElement.click();
        linkElement.click();
    }
}
