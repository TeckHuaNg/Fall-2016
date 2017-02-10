/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergers;

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
public class Intergers extends Application {
    
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
        
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2
        
        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user
        
        sum = number1 + number2; // add numbers, then store total in sum
        
        System.out.printf("Sum is %d%n", sum); // display sum
       
        
        
        launch(args);
    }
    
}
