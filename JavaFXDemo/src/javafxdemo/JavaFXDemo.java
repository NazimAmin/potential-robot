/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author PHIEO_o
 */
public class JavaFXDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn1 = new Button();
        btn1.setText("Second button to close");
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
       btn1.setOnAction(new EventHandler<ActionEvent>() {
       @Override 
       public void handle(ActionEvent event){
          primaryStage.close();
       }
       });
       
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        btn1.setAlignment(Pos.TOP_LEFT);
        root.getChildren().add(btn1);
        System.out.println(btn1.getAlignment());
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
