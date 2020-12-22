package sample;

public class Recipes extends SimpleTest{

    String Name;
    String Approach;
    String Ingredients;
    int NumberOfPortions;
    int CookingTime;

    public Recipes() {

    }
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
