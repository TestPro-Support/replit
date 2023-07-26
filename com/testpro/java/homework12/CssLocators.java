package com.testpro.java.homework12;

public class CssLocators {
    public static void main(String[] args) {


    /*
    Note: For our HW Team
    - Please navigate to https://qa.koel.app/
    - Feel free to use these credentials to check the locators used:
       email: hw@team.com
       password: te$t$tudent


    Homework #12 - CSS locators
    Instructions:
    Create CSS locators for the following web elements on https://qa.koel.app/ (Koel webpage)
    1.) email address field
    2.) submit button
    3.) logout button
    4.) Search field
    5.) Favorites list(located on the homepage, in Playlist block )
    ==============================================================
    Remember to check your locators to meet the following criteria:
    1.) It must be unique
    2.) it should be short (avoid absolute paths and long locators)
    3.) Do not use any plugins to generate locators for you. The whole point of this HW is to practice to find locators by yourself
    */
        String emailFieldLocator = "[type='email']";
        String submitButtonLocator = "button[type='submit']";
        String logoutButtonLocator = ".logout.control";
        String searchFieldLocator = "[type='search']";
        String favoritesLocator = "li.playlist.favorites";

        System.out.println("Locator for email field is: " + emailFieldLocator);
        System.out.println("Locator for submit button is: " + submitButtonLocator);
        System.out.println("Locator for logout button is: " + logoutButtonLocator);
        System.out.println("Locator for search field is: " + searchFieldLocator);
        System.out.println("Locator for favorites is: " + favoritesLocator);
   /*
   OPTIONAL HOMEWORK ONLY

   Instructions:
   1.) For our optional homework (not required), let's try and locate additional web elements on
   https://qa.koel.app/ (Koel webpage) which we will also use in our next homeworks.
   2.) All Songs menu item (located on the homepage, in YOUR MUSIC block)
   3.) First user playlist element (requires at least one playlist to be created by the user, located on the homepage in the Playlist block)
   4.) Sound bar icon (requires the user to play a song, it is located beside the favorite icon on the lower right of the page)
   */
        String allSongsMenuItemLocator = "#sidebar li:nth-child(3)";
        String firstUserPlaylistLocator = "#playlists li:nth-child(3)";
        String soundBarPlayIconLocator = "";

        System.out.println("Locator for the All Songs menu item is: " + allSongsMenuItemLocator);
        System.out.println("Locator for the First user playlist is: " + firstUserPlaylistLocator);
        System.out.println("Locator for the Soundbar icon is: " + soundBarPlayIconLocator);

    }
}



