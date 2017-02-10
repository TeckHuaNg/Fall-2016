package truthtables1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class SimpleMath {
    public static void main(String[] args)
{
    double num1, num2; //this declare 2 variables to store integers
    
    System.out.print("Please enter the first number: ");
    
    Scanner keyboard = new Scanner(System.in);
    num1 = keyboard.nextInt();
    
    System.out.print("Please enter the second number: ");
    num2 = keyboard.nextInt();
    
    System.out.printf("%.0f * %.0f = %.0f %n", num1, num2, num1*num2);
    System.out.printf("%.0f + %.0f = %.0f %n", num1, num2, num1+num2);
    System.out.printf("%.0f - %.0f = %.0f %n", num1, num2, num1-num2);
    System.out.printf("%.2f / %.2f = %.2f %n", num1, num2, num1/num2);
    System.out.printf("%.2f %% %.2f = %.2f %n", num1, num2, num1%num2);

    
    
    
    
}
    
    
}
