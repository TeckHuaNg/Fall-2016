/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec1;

import java.util.MissingFormatArgumentException;

/**
 *
 * @author Michael
 */
public class DiceTest {
    public static void main(String[] args){
        Dice die1 = new Dice(6);
    try{
        Dice die2 = new Dice(2);
    } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
    
       System.out.printf("The face value of die1 initially is: %d%n", die1.getTheFaceValue());
       die1.rollTheDice();
       
       System.out.printf("The face value of die1 initially is: %d%n", die1.getTheFaceValue());
            
       try{
           System.out.printf("This should throw an exception %d");
       }catch (MissingFormatArgumentException e){
           System.out.printf("The error message is %s%n", e.getMessage());
       }
       
       String[] myFriends = {"Dave", "Jimbo","Freddie","Grace"};
       for(int i=0; i<myFriends.length; i++){
           System.out.println(myFriends[i]);
       }
       
       
    }//end of main method    
}
