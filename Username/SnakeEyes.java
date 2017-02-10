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
public class SnakeEyes {
    public static void main(String[] args)
    {
        boolean validDie = false;
        Scanner keyboard = new Scanner(System.in);
        int numOfSides;
        
        do
        {
            System.out.printf("Enter the # of sides of the die: ");
            numOfSides = keyboard.nextInt();
            
            try
            {
                
                Dice die1 = new Dice(numOfSides);    //creates a Dice object this is also called instantiating an object
                validDie = true;
            }
            catch (IllegalArgumentException e)
            {
                System.out.printf("The exception was %s%n", e);
            }
        }   while (!validDie);
        
        System.out.print("The die was created");
        
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        
        int counter = 1;
        
        while (!snakeEyes(die1, die2))
        {
           System.out.printf("Count: %3d  die 1: %d    die 2: %d%n",
                   counter, die1.getFaceValue(), die2.getFaceValue());
            die1.rollDice();
            die2.rollDice();
            counter++;
        }
        
        System.out.printf("It took %d attempts to get snake eyes%n", counter);
        
    }   //end of the main method
    
    public static boolean snakeEyes(Dice die1, Dice die2)
    {
        if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1)
            return true;
        else
            return false;
    }
}