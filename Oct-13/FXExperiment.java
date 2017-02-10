/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class FXExperiment extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label enterSizeLabel = new Label("Enter table size");
        
        HBox entrylayout = new HBox();
        entrylayout.getChildren().add(enterSizeLabel);
        
        //add a text field to get user information
        TextField tableSize = new TextField();
        entrylayout.getChildren().add(tableSize);
        
        //add some spacing around the elements
        entrylayout.setPadding(new Insets(10,10,10,10));
        
        Button btn = new Button();
        btn.setText("Generate Times Table");
        btn.setOnAction(e -> 
        {
            int maxTableSize = Integer.parseInt(tableSize.getText());
            showTimesTable(maxTableSize);
            
        }
                
        );//e -> lamda expression
        
        VBox verticalLayout = new VBox();
        verticalLayout.getChildren().addAll(entrylayout,btn);
        
        
        Scene scene = new Scene(verticalLayout, 600, 250);
        
        primaryStage.setTitle("My First GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void showTimesTable(int tableSize){
         for(int row = 1; row <= tableSize; row++)
        {
            for (int column = 1; column <=tableSize; column++)
        {
            System.out.printf("%4d",row*column);
        }
            System.out.println();
        }
    }
}
