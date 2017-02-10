/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package username;

import java.security.SecureRandom;

/**
 *
 * @author Michael
 */
public class Dice {
    private int numOfSides, faceValue;
    
    
    public Dice (int numberOfSides){
        setNumofSides(numberOfSides);//numOfSides = numberOfSides;
        rollDice(); //give the dice a quick roll to set the initial value
    }
    // this method will use a random number generator to set the face value
    //of dice
    public void rollDice()
    {
        SecureRandom rng = new SecureRandom();
        faceValue = rng.nextInt(numOfSides) + 1;
    }
    
    //This method accepts the number of sides as an argument
    // and sets the instance variable
    
    public void setNumofSides(int numberOfSides)
    {
        if (numberOfSides < 4 || numberOfSides > 12)
            throw new IllegalArgumentException("Dice must have 4-12 sides");
        else
            this.numOfSides = numberOfSides;
    }
    // this method returns the face value of the dice as an integer
    public int getFaceValue()
    {
        return faceValue;
    }
    
}
