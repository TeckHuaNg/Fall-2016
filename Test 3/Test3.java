
package test3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Test3 {
    public static void main(String[] args)
    {
        /**
         * Question 1 - display your name and student number on the screen
         * 1 Mark
         */
        System.out.println("~~~~~~~~~~~~~~~~ Question 1 ~~~~~~~~~~~~~~~~");
        System.out.printf("Teck Hua Ng, 200348264%n");
        
        /**
         * Question 2 - Prompt the user with the phrase "The game - do you know what it means?  Type "yes" or "no" ".  Note:
         * the quotes around yes and no should be visible on the computer screen.
         * 
         * Store the users' input in a variable and then write a conditional statement that will test if the user entered 
         * "yes" or "no".  If the user entered "yes", display the phrase "you lose" to the screen.  If the user entered "no" or any
         * other input, display "you are very lucky" to the screen.
         * 1 mark for prompting the user with quotes around "yes" and "no" 
         * 1 mark for getting and storing the user response
         * 1 mark for creating the proper logic
         * 1 mark for displaying the correct answer
         * 
         * 4 marks total
         */
        System.out.println("~~~~~~~~~~~~~~~~ Question 2 ~~~~~~~~~~~~~~~~");
        
        String answer;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("The game - do you know what it means?  Type yes or no%n");
        answer = keyboard.nextLine();
        
        if(answer.equals("yes"))
            System.out.printf("you lose%n");
        else
            System.out.printf("you are very lucky");
        
        /**
         * Question 3 - Using an array, store the following words in order, 1 word per position
         * in the Array.  Note: nothing should be displayed to the screen
         * 
         * I have learned a lot this semester.
         * 2 Marks
         */
        System.out.println("\n~~~~~~~~~~~~~~~~Question 3 - no screen output for this question ~~~~~~~~~~~~~~~~");
        String[] word = {"I","have","learned","a","lot","this","semester"};
        
        
        /**
         * Question 4 - using a for loop display the words to the screen on 1 line.
         * 2 Marks 
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 4~~~~~~~~~~~~~~~~");

         for(int i=0; i<word.length; i++){
             System.out.printf("%s ", word[i]);
         } 
         /**
          * Question 5 - Store 10 words in an ArrayList object.  Each word should be stored in a different
          * position of the ArrayList.  Note that ArrayList's and Array's are different.  
          * Once the words are in the ArrayList, display them to the screen.
          * 3 Marks
          */
        System.out.println("\n~~~~~~~~~~~~~~~~Question 5 ~~~~~~~~~~~~~~~~");
        
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("is");
        words.add("the");
        words.add("first");
        words.add("thing");
        words.add("I");
        words.add("learned");
        words.add("in");
        words.add("Programming");
        
        for(String element : words){
            System.out.printf("%s%n",element);
        }
         
        /**
         * Question 6 - create a method under the comment at the bottom of the file that will receive
         * the ArrayList from question 5 as an argument and RETURN the total number of letters in the ArrayList.
         * Display the total number of letters here.
         * 
         * 4 Marks (1 mark for calling the method, 1 mark for the method header, 2 marks for the contents
         * of the method.
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 6~~~~~~~~~~~~~~~~");
         
         System.out.printf("Total number of letters is %d%n", totalNumber(words));
        
        /**
         * Question 7 - Write a method that can receive 2 String objects.  The method
         * should join the Strings together with a space between the Strings and return it
         * to the main method.  Test your code by uncommenting the code below.
         * 
         * 3 Marks (1 mark for the method header, 2 marks for the method contents)
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 7~~~~~~~~~~~~~~~~");
         System.out.printf("The joined String is '%s'%n", joinString("Merry", "Christmas"));
         
        
        /**
         * Question 8 - Create a method that will accept the ArrayList from question 5 as an argument.
         * The method should print each of the words stored in the ArrayList to a file called "theGame.txt".
         * Put 1 word on each line of the printed file.
         * 
         * 4 Marks (1 mark for calling the new method, 1 mark for the method header, 2 marks for the method contents)
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 8~~~~~~~~~~~~~~~~");
            
         printFile(words);
         
    }   //end of the main method
    
    /**
     * Question 6 - put the method here
     */
    
    public static int totalNumber(ArrayList<String> word){
        int total = 0;
        for(String element : word){
            total += element.trim().length();
        }
        return total;
    } 
    
    /**
     * Question 7 - put the method biggestString here
     */
   
    public static String joinString(String one, String two){
        String joined;
        
        joined = String.format("%s %s", one, two);
        
        return joined;
    }
    
    /**
     * Question 8 - method goes here
     */
    
    public static void printFile(ArrayList<String> word){
        String printFile = "";
        for(String element : word){
            printFile += String.format("%s%n", element);
        }
        
        try{
            Formatter outputStream = new Formatter("theGame.txt");
            outputStream.format(printFile); // put method that has the string
            outputStream.close();
        }catch (FileNotFoundException e){
            System.out.print("Sorry we cannot write to theGame.txt");
        }
    }
    
}   //end of the class
