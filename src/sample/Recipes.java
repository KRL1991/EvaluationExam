package sample;

import java.util.ArrayList;

public class Recipes extends SimpleTest implements TotalCalories{
// Variables
    String Name;
    String Approach;
    String Ingredients;
    int NumberOfPortions;
    int CookingTime;

    public Recipes() {

    }

// ArrayList - Not sure if it is working though
    public void addIngredients(String name, int calories){

        ArrayList<Ingredients> addedIngredients = new ArrayList<>();

        for (int i = 0; i <addedIngredients.size() ; i++) {
            System.out.println(addedIngredients.size());

        }

    }
// Show Ingredients method not working probably though
    public String showIngredients(){
        ArrayList<Ingredients> ingredientsArrayList2 = new ArrayList<>();

        for (sample.Ingredients ingredients : ingredientsArrayList2)
        {
            System.out.println(ingredientsArrayList2);
        }
        return Ingredients;
    }
// Method that shows Approach of cooking
    public void showApproach(){
        System.out.println("Approach: Fry the steak on a hot pan for 3 minutes on each side");
    }
    public void showApproach2(){
        System.out.println("Approach: Fry Vegetables on a hot pan for 10 minutes ");

    }
    public void showApproachDat(){
        System.out.println("Approach: Get assignment, panick , try and calm yourself down, start coding, " +
                "realize you made constructor mistake, cry, get aha moment and move on with the assignment!");

    }
// Method that Collects showIngredients and showApproach
    public void showRecipe(){

        showIngredients();
        showApproach();
    }
   // Method from Interface - not implemented yet
    @Override
    public int caloriesInTotal() {

        return 0;
    }

    int caloriesPrPortion() {

        caloriesInTotal();



        return 0;
    }

    // Getters and Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getApproach() {
        return Approach;
    }

    public void setApproach(String approach) {
        Approach = approach;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public int getNumberOfPortions() {
        return NumberOfPortions;
    }

    public void setNumberOfPortions(int numberOfPortions) {
        NumberOfPortions = numberOfPortions;
    }

    public int getCookingTime() {
        return CookingTime;
    }

    public void setCookingTime(int cookingTime) {
        CookingTime = cookingTime;
    }


}
