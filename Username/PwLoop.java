/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package username;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class PwLoop {
    public static void main(String [] args)
    {   Scanner keyboard = new Scanner(System.in);
        String password;
        do{
        
        System.out.print("Enter a password: ");
        
        
         password = keyboard.nextLine();
        }
        while (invalidPassword(password));//!password.equals("Swordfish")
            System.out.printf("Success");
          
            
        
    }
    public static boolean invalidPassword(String pw){
        if (pw.equals("SwordFish"))
            return false;
        else {
            System.out.printf("Sorry, that password is invalid%n");
            return true;
        }
    }
}
