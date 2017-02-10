/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct13;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class LoopExample {
    public static void main (String [] args){
        double sales, comission;
        boolean continueDecision = true;
        final double COMMISSION_RATE = 0.1;
        Scanner keyboard = new Scanner(System.in);
        while(continueDecision)
        {
            System.out.print("Enter the amount of sales: ");
            sales = keyboard.nextDouble();
            
            comission = sales * COMMISSION_RATE;
            System.out.printf("The comission is $%.2f%n", comission);
            System.out.print("Do you want to calculate another? Type \"yes\""
            + "or\"no\"");
            
            keyboard.nextLine();//clear the enter command from the buffer
            String userDecision = keyboard.nextLine();
            
            if(userDecision.equalsIgnoreCase("yes"))
                continueDecision = true;
            else
                continueDecision = false;
            //continueDecision = userDecision.equalsIgnoreCase("yes");(alternative way)
        }
    }
}
