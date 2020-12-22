package sample;

import java.util.ArrayList;

public class SimpleTest {

    public static void main(String[] args) {

        System.out.println("Welcome to the DAT.1 Cookbook\n");
// Adds a new object
        Recipes steak = new Recipes();
        System.out.println("Steak recipe added");
        steak.Ingredients = "Beef";
        System.out.println("Ingredient added: Beef");
        steak.Ingredients = "Assorted Vegetables";
        System.out.println("Ingredient added: Vegetables");
        steak.addIngredients("Salt",0);
        steak.addIngredients("Pepper",0);
        steak.addIngredients("butter",200);

        // Method with loop but its not working correctly
        steak.showIngredients();

        // Method that shows approch
        steak.showApproch();
        steak.blankLine();

        // Method that combines showIngredients and showApproach though showIngredients doesnt work
        steak.showRecipe();

        // Method that informs of richness in calories
        Ingredients butter = new Ingredients();
        System.out.println("Butter is: ");
        butter.richOnCalories(200);


        steak.blankLine();

// Adds a new object
        Recipes vegetarian = new Recipes();
        System.out.println("Vegetarian recipe added");
        vegetarian.Ingredients = "Assorted Vegetables";
        System.out.println("Ingredient added: Assorted Vegetables ");
        vegetarian.addIngredients("Chili",0);
        vegetarian.addIngredients("Olive oil", 15);

        // Method with loop but its not working correctly
        vegetarian.showIngredients();

        // Method that shows approch
        vegetarian.showApproch();

        // Method that informs of richness in calories
        Ingredients oliveOil = new Ingredients();
        System.out.println("Olive Oil is: ");
        oliveOil.richOnCalories(15);




    }
// method for blank line
    public void blankLine(){

        System.out.println("\n");}






    }







