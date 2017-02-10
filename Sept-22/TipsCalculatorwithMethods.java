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
public class TipsCalculatorwithMethods {
    public static void main(String[] args)
    {
        double mealCost = getMealCost();
        double tipPercent = getTipPercentage();
        
        double tipAmount = getTipAmount(mealCost, tipPercent);
        System.out.printf("You should tip $%.2f%n", tipAmount);
        
        System.out.printf("A $100 meal with a 19%% tip should be $%.2f%n", 
                getTipAmount(100, 19));
        
    }
    
   public static double getMealCost()
   {
     System.out.print("What was the cost of your meal?");
     Scanner keyboard = new Scanner(System.in);
     return keyboard.nextDouble();
       
   }
   public static double getTipPercentage()
   {
       System.out.printf("Please enter the tip percentage: ");
       Scanner keyboard = new Scanner(System.in);
       return keyboard.nextDouble();
   }
   public static double getTipAmount(double mealAmount, double tipP)
   {
       tipP = tipP/100;
       return mealAmount * tipP;
   }
   
}
