/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journey;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void playGameAction(ActionEvent event) {
    }

    @FXML
    private void aboutGameAction(ActionEvent event) {
    }

    @FXML
    private void loadGameAction(ActionEvent event) {
    }

    @FXML
    private void quitGameAction(ActionEvent event) {
        
    }
    
}
