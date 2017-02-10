/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept29;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class NumberAdd {
    public static void main (String [] args)
    {
        //prompt user to enter 2 number
        System.out.print("please enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        
        System.out.print("PLease enter a second number: ");
        int num2 = keyboard.nextInt();
        
        //send the numbers to a method called sum
        sum(num1, num2);
        sum(56523, 48456);
        sum(7889, 13233);
    }// end of main method
    // this method will accept two integers as arguments and print
    //their sum to screen
    public static void sum(int n1,int n2)
    {
        System.out.printf("Sum of %d + %d is %d ",n1 ,n2,n1 + n2);
    }
}
