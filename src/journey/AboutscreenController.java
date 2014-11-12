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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class AboutscreenController implements Initializable {
    @FXML
    private AnchorPane aboutAnchorPane;
    @FXML
    private WebView aboutWebView;
    @FXML
    private Label loadingWebView;
    @FXML
    private Button closeAbout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    loadingWebView.setVisible(true);
    WebEngine engine = aboutWebView.getEngine();
    engine.load("http://en.wikipedia.org/wiki/Journey_Through_Europe");
    loadingWebView.setVisible(false);
    
    }    

    @FXML
    private void closeAboutWindow(ActionEvent event) {
        
    Node  source = (Node)event.getSource(); 
    Stage stage  = (Stage) source.getScene().getWindow();
//    stage.getOnCloseRequest().handle(null);
    stage.close();
    }
    
}
