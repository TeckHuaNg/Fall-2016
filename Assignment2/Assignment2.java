/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Assignment2 {
    char[][] crossWord;
    ArrayList<String> wordList = new ArrayList<>();
    int numWords;
    
/**
 * The Constructor
 */
    public Assignment2()
    {
      
        this.numWords = getNumberOfWords();
        crossWord = new char[numWords][numWords]; 
    }  
    /**
     * Prompt user for number
     */
    public static int getNumberOfWords(){
        
        int validNum = 0;
        while(!(validNum>=5 && validNum<=20)){
            Scanner keyboard = new Scanner(System.in);
            try{     
               System.out.printf("%nPlease enter number of words: ");
               validateNumber(validNum = keyboard.nextInt());
               }catch(InputMismatchException e){
                  System.out.printf("Sorry, the number is not valid. Please enter a number from 5 -20", e);
             }
                catch (IllegalArgumentException ex)
                {
                    System.out.printf(ex.getMessage().replaceAll("%n", " "));
                }
        }
     return validNum;
    }
    public void getWords(){
        Scanner keyboard = new Scanner(System.in);
       
        // Get words to fill the array
        int count = 0;
        while(count < numWords) {
           try{
               System.out.print("Enter a new word: ");
               String newWord = keyboard.nextLine();
               validateWord(newWord.trim());          
               wordList.add(newWord.toUpperCase());
               count++;
            }
           catch(IllegalArgumentException e){
               System.out.printf("Sorry, the word is invalid, %s%n", e);
           }
        }
        
    }  
        /*
        Change word from array to string
        */
    
    @Override
     public String toString(){
         Collections.sort(wordList);
         
         String str = "";
         for(String element : wordList){
             str += String.format("%s%n", element);
         }
         return String.format("Here are the words to find:%n%s", str);
     }   
          
        
    
    /**
     *Validate number entered 
     */
    public static void validateNumber(int valid){
        
        if (!(valid>=5 && valid<=20))
            throw new IllegalArgumentException(
            "The number is not valid%n");
        
    }
    /*
    Validate words entered
    */
    public void validateWord(String word){
            
        
            if(word.length()>numWords)
                throw new IllegalArgumentException("The word is too long.");
            if(word.length() == 1)
                throw new IllegalArgumentException("The word is too short");
            if(word.contains(" "))
                throw new IllegalArgumentException("The word has spacing");
            if(wordList.size()>0){
              for(int i=0; i<wordList.size(); i++)
                if(word.equalsIgnoreCase(wordList.get(i)))
                  throw new IllegalArgumentException("The word is a duplicate"); 
        }
    }
       
    
    //Create crossword puzzle and fill empty spaces
    
    public void fillEmpties(){
        SecureRandom rng = new SecureRandom();
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                          'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        for(int i=0; i<wordList.size();i++){
            String word = wordList.get(i);
            int random;
            if(wordList.size() - word.length() == 0)
                random = 0;
            else
                random = rng.nextInt(wordList.size() - word.length());
            for(int j=0; j<word.length(); j++){
            crossWord[random][i] = word.charAt(j);
            random++;
        }
        }
       
        
        for (int row=0; row<crossWord.length;row++){
            for(int col=0;col<crossWord.length;col++){
                 int alpha = rng.nextInt(26);
                if (crossWord[row][col] != 0)
                    System.out.printf("%3c", crossWord[row][col]);
                else
                    System.out.printf("%3c",letters[alpha]);
                  }
            System.out.println();
        }
        }// end of fill empties method
       
       
    
    public static void main(String[] args) {
      Assignment2 puzzle = new Assignment2();
      puzzle.getWords();
      puzzle.fillEmpties();
     
      System.out.print(puzzle.toString());
    }
    
}
