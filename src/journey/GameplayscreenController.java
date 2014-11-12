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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class GameplayscreenController implements Initializable {
    @FXML
    private Button saveGame;
    @FXML
    private Button gameHistory;
    @FXML
    private Button aboutGame;
    @FXML
    private Button flighPlan;
    @FXML
    private Label gameplayPlayerName;
    @FXML
    private AnchorPane gridAncOne;
    @FXML
    private AnchorPane gridAncTwo;
    @FXML
    private AnchorPane gridAncThree;
    @FXML
    private AnchorPane gridAncFour;
    @FXML
    private ImageView mapSelectionOne;
    @FXML
    private ImageView mapSelectionTwo;
    @FXML
    private ImageView mapSelectionThree;
    @FXML
    private ImageView mapSelectionFour;
    @FXML
    private ImageView firstMap;
double col=0;
        double row=0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      //  readCSV csvData = new readCSV();
        
        firstMap.setOnMouseClicked(e->{
            
            System.out.println("ok");
        //int mapW = (int)firstMap.getFitWidth();
        //int mapX = (int)firstMap.getFitHeight();
        col = e.getX();//*
        row = e.getY();//*
            System.out.println(""+col+" "+row);
            
          double xxx=col+10;
          double xxxx=col-10;
          double yyy=row+10;
          double yyyy=row-10;
        for(int i = 0; i < 180; i++){

            if((col-readCSV.x[i]) >= -10 && (col-readCSV.x[i] <= 10)){
                if((row-readCSV.y[i]) >= -10 && (row-readCSV.y[i] <= 10)){
                      System.out.println("x: "+ readCSV.x[i]);
            System.out.println("y: "+ readCSV.y[i]);
                if (readCSV.quad[i] == 1){
                    System.out.println(readCSV.citiesname[i]);
                } 
                }
            } 
         
        }     
        });
    }    

    @FXML
    private void saveGameState(ActionEvent event) {
    }

    @FXML
    private void openGameHistory(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gamehistory.fxml"));
        Parent root;
        root = (Parent) loader.load();
        Scene scene = new Scene(root, 800, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void openAboutGame(ActionEvent event) throws IOException {
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Scene scene = stage.getScene();
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutscreen.fxml"));
    Parent root = (Parent) fxmlLoader.load();          
    scene.setRoot(root);
    }

    @FXML
    private void showFlightPlan(ActionEvent event) {
    }

    @FXML
    private void firstMapClicked(MouseEvent event) {
        

     
    }
    
}
