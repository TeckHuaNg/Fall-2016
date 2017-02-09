/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec1;

import java.security.SecureRandom;

/**
 *
 * @author Michael
 */
public class Dice {
    private int numberOfSides;
    private int faceValue;
    
    //The system will create a default constructor that look like this
    public Dice(){
        
    }
    
    //This constructor will accept the number of sides on the Dice object
    public Dice(int numOfSides){
        if (numOfSides < 4 || numOfSides > 100)
            throw new IllegalArgumentException(numOfSides + " is outside the" + 
                    "valid range for sides of a dice (4 - 100)");
    
    this.numberOfSides = numOfSides;
    this.faceValue = 1;
    
    //no value will show null pointer exception
    }//end of constructor
    
    public void rollTheDice(){
        SecureRandom rng = new SecureRandom();
        faceValue = rng.nextInt(numberOfSides) + 1;
  
    }
    
    public int getTheFaceValue(){
        return faceValue; //outside of class, we can see the value but cannot access
    }
}
