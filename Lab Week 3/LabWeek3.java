/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek3;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class LabWeek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String usersName;

        usersName = getUsersName();
        sendGreeting(usersName);
        
    }
    public static String getUsersName()
    {
        System.out.print("Please enter your name: ");
        Scanner keyboard = new Scanner(System.in);
        
        String usersName = keyboard.nextLine();
        return usersName;
    }
    public static void sendGreeting(String usersName)
    {
       System.out.printf("Hello %s", usersName);
        
    }
    
}
    
    

