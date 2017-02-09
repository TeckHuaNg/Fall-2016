/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec1;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class CustomWriter {
    
    /**
     * This file will continuously ask the user for input and write
     * it to a file called harambe.txt until the user type "exit"
     */
    public void printTofile(){
        try{
            Formatter outputStream = new Formatter("harambe.txt");
            
            Scanner keyboard = new Scanner(System.in);
            String userInput;
            do{
                System.out.printf("Enter some text and I'll write it to a file (Type exit to close)");
                userInput = keyboard.nextLine();
                if(!userInput.equalsIgnoreCase("exit"))
                   outputStream.format(userInput + "%n"); // put method that has the string
            }while(!userInput.equalsIgnoreCase("exit"));
            outputStream.close();
        }catch (FileNotFoundException e){
            System.out.print("Sorry we cannot write to harambe.txt");
        }
    }
    
    public static void main(String args[]){
        CustomWriter myWriter = new CustomWriter();
        myWriter.printTofile();
    }
}
