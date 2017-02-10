/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov10;

import java.security.SecureRandom;

/**
 *
 * @author Michael
 */
public class Q8Array {
    public static void main(String[] args){
        //declare an array of integers to store the count
        int[] countOfRandomNumber = {0,0,0,0,0,0,0,0,0,0};
        
        //This will create 1000 random numbers and store the count
        SecureRandom rng = new SecureRandom();
        for(int i=1; i<=1000; i++){
            int randomNum = rng.nextInt(10);
            countOfRandomNumber[randomNum]++;
            displayIntArray(countOfRandomNumber);
        }
        //this will loop over the array and display the results
        for(int i=0; i < countOfRandomNumber.length; i++){
            System.out.printf("%2d: %4d%n", i+1, countOfRandomNumber[i]);
        }
    }
    /**
     * This method will display an array of integers
     */
     
    public static void displayIntArray(int[] arrayToDisplay){
     //this will loop over the array and display the results
        for(int i=0; i < arrayToDisplay.length; i++){
            System.out.printf("%2d: %4d%n", i+1, arrayToDisplay[i]);
        }
} 
}
