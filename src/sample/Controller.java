package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    @FXML
    private Button saveRecipe;

    @FXML
    private Tab welcome;

    @FXML
    private Button ButtonGoToRecipes;

    @FXML
    private Tab steakTab;

    @FXML
    private Button steakNextRecipe;

    @FXML
    private Tab vegetarianTab;

    @FXML
    private Button VegetarianNextRecipe;

    @FXML
    private Tab datTears;

    @FXML
    private TabPane tabPane;


    @FXML
    void goToDatTears(ActionEvent event) {



    }

    @FXML
    void goToHome(ActionEvent event) {



    }

    @FXML
    void goToNext(ActionEvent event) {


    }

    @FXML
    void goToRecipe(ActionEvent event) {



    }
    @FXML
    void saveAddedRecipe(ActionEvent event) throws IOException {
//Save function not finnished

        BufferedWriter output = new BufferedWriter(new FileWriter("SavedRecipes.txt"));

        output.append(saveRecipe.getText());





    }
}
