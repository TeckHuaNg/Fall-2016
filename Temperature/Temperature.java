/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.io.PrintStream;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class Temperature extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("What is the temperature outside? ");
        
        Scanner keyboard = new Scanner(System.in);
        int temp = keyboard.nextInt() ;
        
        System.out.print("\nThe temperature outside is: " + temp);
        
        if ((temp >=20) && (temp <=30))
            System.out.print("\nIt is nice enough to wear shorts");
        
        if ( temp == 15)
            System.out.print("\nIt's greater sweater weather");
        
        
        
        launch(args);
    }
    
}
