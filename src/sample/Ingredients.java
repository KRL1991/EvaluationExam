package sample;

public class Ingredients extends SimpleTest {

    String Ingredients;
    int Calories;

    public Ingredients() {
    }


    public void richOnCalories(int kCal){


        if (kCal > 100) {
            System.out.println("Rich on Calories");
        } else System.out.println("Not Rich on Calories");

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
