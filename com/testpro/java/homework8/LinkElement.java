package com.testpro.java.homework8;

public class LinkElement extends BaseElement {
    // 4.) Create a method named click() in the LinkElement class
    public void click() {
        System.out.println("clicked and redirected");
        System.out.println("locator = " + locator);
    }
}