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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class GamehistoryController implements Initializable {
    @FXML
    private Button closeHistory;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void closeHistoryWindow(ActionEvent event) {
    //Node  source = (Node)  event.getSource(); 
    Stage stage  = (Stage) closeHistory.getScene().getWindow();
//    stage.getOnCloseRequest().handle(null);
    stage.close();
    
    }
    
}
