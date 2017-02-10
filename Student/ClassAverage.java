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
public class ClassAverage {
    
    public static void main(String[] args)
    {
        //create scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        //intialization phase
        int total = 0;// initialize sum of grades entered by the user
        int gradeCounter = 1;// initialize # of grade to be entered next
        
        //processing phase uses counter-controlled repetition
        while (gradeCounter <= 10)// loop 10 times
        {
            System.out.print("Enter Grade: ");//prompt
            int grade = input.nextInt();// input next grade
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1;// increment counter by 1
        }
        // termination phase
        int average = total / 10;//integer division yields integer result
        
        //display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    
    
    }
    
    
    
    
}
