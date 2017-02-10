/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthtables1;

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
public class TruthTables1 extends Application {
    
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
      
    {
        System.out.print("TRUE AND TRUE = " + (true&true));
        System.out.print("\nTRUE AND FALSE = " + (true&&false));
        System.out.print("\nTRUE AND FALSE = " + (false&false));
        
        System.out.print("\n TRUE OR TRUE = " + (true ||true));
        System.out.print("\nTRUE OR FALSE = " + (true ||false));
        System.out.println("\nFALSE OR FALSE = " + (false||false));
        
        System.out.print("\n5 >10 = " + (5>10));
        System.out.print("\n5 <10 = " + (5<10));
        System.out.print("\n5 <=10 = " + (5<=10));
        System.out.print("\n5 >=10 = " + (5>=10));
        System.out.print("\n5 ==10 = " + (5==10));
        System.out.print("\n5 ==5 = " + (5==5));
        
        
    }
    
        
        launch(args);
    }
    
}
