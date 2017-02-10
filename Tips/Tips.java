/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tips;

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
public class Tips extends Application {
    
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
        
        double num1, num2, sum ; // 3 variables
        
        System.out.print("Meal Amount: ");
        
        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt() ;
        
        
        System.out.print("Tips percentage");
        num2 = keyboard.nextDouble() ;
        
        sum = num1 * num2 / 100 ;
        
        System.out.printf("Tips to pay: %.2f%n" , sum) ;
        
        
        
        
        
        
        
        
        
        
        launch(args);
    }
    
}
