
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Question 1 - display your name and student number to the screen
         * 1 Mark
         */
        System.out.println("Question 1");
        System.out.println("Teck Hua Ng, 200348264");
        
        
        /**
         * Question 2 - Create a for loop that will display the numbers 100 to 120 on
         * the screen, going up by 1 each time
         * 2 Marks
         */
        System.out.println("Question 2");
        for(int i=100; i<=120; i++){
            if (i!=120)
            System.out.printf("%d,", i);
            else
                System.out.printf("%d", i);
        
        }
        System.out.println();
        /**
         * Question 3 - Create a while loop that will display the numbers 120 to 100 on 
         * the screen, going down by 2 each time
         * 2 Marks
         */
        System.out.println("Question 3");
        int count = 120;
        while(count>=100){
            if (count!=100)
                System.out.printf("%d,",count);
            else
                System.out.printf("%d", count);
            count-=2;
        
        }
        System.out.println();
        /**
         * Question 4 - Have the computer generate a random number between 1 and 100, then display it 
         * to the screen
         * 2 Marks
         */
        System.out.println("Question 4");
        SecureRandom rng = new SecureRandom();
        int RanNum = rng.nextInt(100)+1;
        System.out.println(RanNum);
        
        
        /**
         * Question 5 - Prompt the user to enter the name of their favourite course and store the information in a 
         * variable
         * 2 Marks
         */
        System.out.println("Question 5");
        Scanner keyboard = new Scanner (System.in);
        String fav;
        System.out.print("Enter the name of your favourite course: ");
        fav = keyboard.nextLine();
        
        
        
        /**
         * Question 6 - Prompt the user to enter their grade in their favourite course.  Then display to the screen
         * "Your favourite course is [their favourite course] and you have a mark of [what their mark is]"
         * 2 Marks
         */
        System.out.println("Question 6");
        System.out.print("Enter your grade for your favourite course: ");
        int grade = keyboard.nextInt();
        
        System.out.printf("Your favourite course is %s and you have a mark of %d%n",fav.toUpperCase(),grade);
        
        
        /**
         * Question 7 - Create a method called sum that will receive 2 integers as arguments and return their sum. 
         * In the space below, test your method and display the result to the screen.
         * Note: be sure to place the sum method outside of the main method.
         * 3 Marks
         */
        System.out.println("Question 7");
        System.out.printf("%d%n",sum(50,200));
        
        
        /**
         * Question 8 - Create a loop that will generate 1000 random numbers between the range of 1-10.
         * Track how many times each number is generated and at the end, display the results in a table.
         * The columns should line up.
         * 
         * An example output is
         *   1:  116
         *   2:  112
         *   3:   86
         *   4:   98
         *   5:   85
         *   6:  110
         *   7:  101
         *   8:  100
         *   9:   84
         *  10:  108
         * 
         * Marks 5
         */
        System.out.println("Question 8");
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;
        int counter10 = 0;
        
        for(int roll = 1; roll<=1000; roll++){
            int number = rng.nextInt(10)+1;
            switch (number) {
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
                case 6:
                    counter6++;
                    break;
                case 7:
                    counter7++;
                    break;
                case 8:
                    counter8++;
                    break;
                case 9:
                    counter9++;
                    break;
                default:
                    counter10++;
                    break;
            }

        }
        System.out.printf("1:\t%d%n2:\t%d%n3:\t%d%n4:\t%d%n5:\t%d%n6:\t%d%n7:\t%d%n8:\t%d%n9:\t%d%n10:\t%d%n"
        ,counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9, counter10);
        /**
         * Question 9 - Create a method called "speedEvaluator" that will receive the speed of a vehicle
         * as an argument.   
         * 
         * If the speed is 50 kph or less, the method should return "city driving"
         * If the speed is 51-90 kph, the method should return "rural driving"
         * If the speed is 90-125 kph, the method should return "highway driving"
         * If the speed is greater than 125, the method should return "speeding"
         * 
         * To test your method, remove the comments from the following lines of code.
         * Marks 5
         */
        System.out.println("Question 9");
        System.out.printf("42 kph means the person is doing %s%n", speedEvaluator(42));
        System.out.printf("50 kph means the person is doing %s%n", speedEvaluator(50));
        System.out.printf("90 kph means the person is doing %s%n", speedEvaluator(90));
        System.out.printf("91 kph means the person is doing %s%n", speedEvaluator(91));
        System.out.printf("115 kph means the person is doing %s%n", speedEvaluator(115));
        System.out.printf("125 kph means the person is doing %s%n", speedEvaluator(125));
        System.out.printf("126 kph means the person is doing %s", speedEvaluator(126));
        
        
        
    }   //end of the main method
    
    
    /**
     * Question 7 - the sum method goes under here.
     * @param x
     * @param y
     * @return 
     */
    public static int sum(int x, int y){
        int sum = x+y;
        return sum;
        
     }
    /**
     * Question 9 - the speedEvaluator method goes under here.
     */
    public static String speedEvaluator(int x){
        if (x <= 50)
            return "city driving";
        if (x >= 51 && x <=90)
            return "rural driving";
        if (x > 90 && x <= 125)
            return "highway driving";
        
        return "speeding";
    }
    
    
    }
    

