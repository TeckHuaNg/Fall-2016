/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept22;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class AverageGrade {
    public static void main(String[] args)
    {
       String usersName = getUsersName();

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
       System.out.printf("Hello %s%n", usersName);
    }
    
}

