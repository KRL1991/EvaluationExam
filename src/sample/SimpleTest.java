package sample;

import java.util.ArrayList;

public class SimpleTest {

    public static void main(String[] args) {

        System.out.println("Welcome to the DAT.1 Cookbook\n");

        Recipes steak = new Recipes();
        System.out.println("Steak recipe added");
        steak.Ingredients = "Beef";
        System.out.println("Ingredient added: Beef");
        steak.Ingredients = "Assorted Vegetables";
        System.out.println("Ingredient added: Vegetables\n");

        Recipes vegetarian = new Recipes();
        System.out.println("Vegetarian recipe added");
        vegetarian.Ingredients = "Assorted Vegetables";
        System.out.println("Ingredient added: Assorted Vegetables ");
    }
    public void blankLine(){

        System.out.println("\n");}






    }







