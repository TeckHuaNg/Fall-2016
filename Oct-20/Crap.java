
import java.security.SecureRandom;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael 
 */
public class Crap {
    
    private enum Status {WON, LOST, CONTINUE};//create variable with enum
    
    public static void main(String[] args){
        Status gameStatus;
        
        System.out.print("Please enter your bet:$ ");
        Scanner keyboard = new Scanner(System.in);
        int bet = keyboard.nextInt();
        int wallet = 1000;
        int result;
        
        int sumOfDice = rollTheDice();
        final int SNAKE_EYES = 2;//value of final will never change
        final int TREY = 3;
        final int SEVEN = 7;
        final int YO_LEVEN = 11;
        final int BOXCARS = 12;
        
        
        
        switch (sumOfDice){
            //these are the cases where the roller wins
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                         
                break;//jump to the end of switch
                
            //these are the cases where the roller loses
            case SNAKE_EYES:
            case TREY:
            case BOXCARS:
                gameStatus = Status.LOST;
                break;    
            
            default:
                gameStatus = Status.CONTINUE;
        }//end of the switch
        
        int myPoint = sumOfDice;
        
       
         while (gameStatus == Status.CONTINUE){
                         
             sumOfDice = rollTheDice();
              
            
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
           
            
        }
        
        if (gameStatus == Status.WON)
            System.out.printf("The Player wins $%d", bet);
        else
            System.out.printf("The house wins $d", bet);
        
    }
    //This method will simulating rolling 2X6 sided dice and return their sum
    public static int rollTheDice(){
    SecureRandom rng = new SecureRandom();//import secure random
    int die1 = rng.nextInt(6)+1;
    int die2 = rng.nextInt(6)+1;
    
    System.out.printf("%d + %d = %d%n ", die1, die2, die1+die2);
    return die1 + die2;
}
   
    }
        

