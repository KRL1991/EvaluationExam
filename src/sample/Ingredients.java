package sample;

public class Ingredients extends SimpleTest {

    String Ingredients;
    int Calories;



    public Ingredients(String ingredients, int calories) {
        Ingredients = ingredients;
        Calories = calories;
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
