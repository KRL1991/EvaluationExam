package sample;

public class Ingredients extends SimpleTest implements TotalCalories {

    String Ingredients;
    int Calories;

    Diet diet;



    public Ingredients() {
    }


    public void richOnCalories(int kCal){


        if (kCal > 100) {
            System.out.println("Rich on Calories");
        } else System.out.println("Not Rich on Calories");

        }
    // Method from Interface - not implemented yet
    @Override
    public int caloriesInTotal() {
        return 0;
    }



    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }


}
