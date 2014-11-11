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
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button playGameButton;
    @FXML
    private Button loadGameButton;
    @FXML
    private Button aboutGameButton;
    @FXML
    private Button quitGame;
    @FXML
    private AnchorPane mainAnchorPane;
    Stage stage;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void playGameAction(ActionEvent event) throws IOException {
    
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Scene scene = stage.getScene();
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("playerselection.fxml"));
    Parent root = (Parent) fxmlLoader.load();          
    scene.setRoot(root);
    
    }

    @FXML
    private void aboutGameAction(ActionEvent event) throws IOException {
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Scene scene = stage.getScene();
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutscreen.fxml"));
    Parent root = (Parent) fxmlLoader.load();          
    scene.setRoot(root);
    }

    @FXML
    private void loadGameAction(ActionEvent event) {
    }

    @FXML
    private void quitGameAction(ActionEvent event) {
     Stage stage = (Stage) quitGame.getScene().getWindow();
     stage.close();
    }
    
}
