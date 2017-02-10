/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favourite.app;

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
public class FavouriteApp  {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("What is your favourite app?");
        
        Scanner keyboard = new Scanner(System.in);
        String appName = keyboard.nextLine() ;
        
        System.out.print("What is your second favourite app?");
        String appName2 = keyboard.nextLine() ;
        
        System.out.print("What is your third favourite app?");
        String appName3 = keyboard.nextLine() ;
        
        System.out.print("What is your fourth favourite app?");
        String appName4 = keyboard.nextLine() ;
        
        System.out.print("What is your last favourite app?");
        String appName5 = keyboard.nextLine();
        
        System.out.printf("Your favourite apps are: %s, %s, %s, %s, %s",   appName
        ,appName2, appName3, appName4, appName5) ;
       
    }
    
}
