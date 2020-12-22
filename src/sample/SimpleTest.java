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
        // Method that shows if it is good against a cold
        IngredientsNutritionInformation butter1 = new IngredientsNutritionInformation("Butter",1,2,3);
        butter1.goodAgainstACold();




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
        vegetarian.showApproch2();

        // Method that informs of richness in calories
        Ingredients oliveOil = new Ingredients();
        System.out.println("Olive Oil is: ");
        oliveOil.richOnCalories(15);
        // Method that shows if it is good against a cold
        IngredientsNutritionInformation oliveOil1 = new IngredientsNutritionInformation("Olive Oil",10,2,3);
        oliveOil1.goodAgainstACold();

        oliveOil.blankLine();

        Recipes datStudentsTears = new Recipes();
        datStudentsTears.addIngredients("Java",1500);
        datStudentsTears.addIngredients("Errors occuring",200);
        datStudentsTears.addIngredients("Tears",150);
        datStudentsTears.addIngredients("Distress", 400);
        datStudentsTears.addIngredients("Frustration",1000);
        datStudentsTears.addIngredients("Aha Moments",10000);
        datStudentsTears.showIngredients();
        datStudentsTears.showApprochDat();

        Ingredients tears = new Ingredients();
        System.out.println("Dat students tears is: ");
        tears.richOnCalories(150);




    }
// method for blank line
    public void blankLine(){

        System.out.println("\n");}






    }







