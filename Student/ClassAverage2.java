/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class ClassAverage2 {
    public static void main(String[] args)
    {
        //create scanner to obtain input from command window
        Scanner input = new Scanner (System.in);
        
        
        //initialization phase
        int total = 0;//initialize sum of grades
        int gradeCounter = 0;// initialize # of grades entered so far
        
        //processing phase
        //prompt user for input and read grade
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        
        //loop until sentinal value read from user
        while(grade != -1)
        {
            total = total + grade;//add grade to total
            gradeCounter = gradeCounter + 1;// increment counter
            
            //prompt user for input and read next grade
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        //termination phase
        //if user entered at least one grade..
        if (gradeCounter != 0)
        {
            //use number with decimal point to calculate average of grades
            double average = (double) total / gradeCounter;
            
            //display total and average( with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else //no grades were entered, so output appropriate message
            System.out.println("NO grades were entered");
    }
}
