/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journey;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class PlayerselectionController implements Initializable {
    public static int playernumber = 0;
    
    
    @FXML
    private MenuButton menu;
    @FXML
    private GridPane playerGrid;
    @FXML
    private AnchorPane ancone;
    @FXML
    private AnchorPane anctwo;
    @FXML
    private AnchorPane ancthree;
    @FXML
    private AnchorPane ancfour;
    @FXML
    private AnchorPane ancfive;
    @FXML
    private AnchorPane ancsix;
    @FXML
    private Button goButton;
    @FXML
    private ToggleGroup playerBlack;
    @FXML
    private ToggleGroup playerYellow;
    @FXML
    private ToggleGroup playerBlue;
    @FXML
    private ToggleGroup playerRed;
    @FXML
    private ToggleGroup playerGreen;
    @FXML
    private ToggleGroup playerWhite;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void change2(ActionEvent event) {
        menu.setText("2");
        playerGrid.getChildren().removeAll(ancone, anctwo, ancthree, ancfour, ancfive, ancsix);
        playerGrid.getChildren().addAll(ancone, anctwo);
            playernumber = 2;
        
    }

    @FXML
    private void change3(ActionEvent event) {
       
        menu.setText("3");
        playerGrid.getChildren().removeAll(ancone, anctwo, ancthree, ancfour, ancfive, ancsix);
        playerGrid.getChildren().addAll(ancone, anctwo, ancthree);
        playernumber = 3;
    }

    @FXML
    private void change4(ActionEvent event) {
        menu.setText("4");
        playerGrid.getChildren().removeAll(ancone, anctwo, ancthree, ancfour, ancfive, ancsix);
        playerGrid.getChildren().addAll(ancone, anctwo, ancthree, ancfour);
        playernumber = 4;
        
    }

    @FXML
    private void change5(ActionEvent event) {
        menu.setText("5");
        playerGrid.getChildren().removeAll(ancone, anctwo, ancthree, ancfour, ancfive, ancsix);
        playerGrid.getChildren().addAll(ancone, anctwo, ancthree, ancfour, ancfive);
        playernumber = 5;
    }

    @FXML
    private void change6(ActionEvent event) {
        menu.setText("6");
        playerGrid.getChildren().removeAll(ancone, anctwo, ancthree, ancfour, ancfive, ancsix);
        playerGrid.getChildren().addAll(ancone, anctwo, ancthree, ancfour, ancfive, ancsix);
        playernumber = 6;
    }

    @FXML
    private void startGameAction(ActionEvent event) throws IOException {
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Scene scene = stage.getScene();
    FXMLLoader aboutGameLoader = new FXMLLoader(getClass().getResource("gameplayscreen.fxml"));
    Parent root = (Parent) aboutGameLoader.load();  
    scene.setRoot(root);
    }

    
}
