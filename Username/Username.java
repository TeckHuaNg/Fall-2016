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
public class Username {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //prompt user to enter name
        System.out.print("Enter your name: ");
        Scanner keyboard = new Scanner (System.in);
        String flname = keyboard.nextLine();
        
                
        //prompt user for year they born
        System.out.print("Enter the year you are born: ");
        int year = keyboard.nextInt();
        
        //method
        int age = getAge(year);//not necessary
        
        System.out.printf("Your name is %s, you are %d years old",flname ,age);
        //can insert get method directly into variable
        
    }
    public static int getAge(int y1){
        return 2016 - y1;
    }
    
}
