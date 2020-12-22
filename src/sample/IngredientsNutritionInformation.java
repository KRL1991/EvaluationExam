package sample;

public class IngredientsNutritionInformation extends Ingredients{

    String name;
    int cvitamin;
    int magnesium;
    int kalk;


    public IngredientsNutritionInformation(String name, int cvitamin, int magnesium, int kalk) {
        this.name = name;
        this.cvitamin = cvitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;
    }

    public void goodAgainstACold(){

        if( cvitamin > 5) System.out.println("Good against a Cold");
        else System.out.println("Not good against a Cold");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCvitamin() {
        return cvitamin;
    }

    public void setCvitamin(int cvitamin) {
        this.cvitamin = cvitamin;
    }

    public int getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(int magnesium) {
        this.magnesium = magnesium;
    }

    public int getKalk() {
        return kalk;
    }

    public void setKalk(int kalk) {
        this.kalk = kalk;
    }
}
