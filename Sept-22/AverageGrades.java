/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept22;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class AverageGrades {
    public static void main(String[] args)
    {
        double grade1 = getGrade(1);
        double grade2 = getGrade(2);
        double grade3 = getGrade(3);
        double grade4 = getGrade(4);
        double grade5 = getGrade(5);
        
        //call a method to calculate the average of 5 grades
        double avg = getAverage(grade1, grade2, grade3, grade4, grade5);
        
        //display the results
        System.out.printf("The average grade is %.1f%% %n%n", avg);
    }
    public static double getGrade(int coursenum)
    {
        System.out.printf("Please enter the grade for course %d: ", coursenum);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
    public static double getAverage(double g1, double g2, double g3, double g4, double g5)
    {
        return (g1+g2+g3+g4+g5)/5;
    }
    
}
