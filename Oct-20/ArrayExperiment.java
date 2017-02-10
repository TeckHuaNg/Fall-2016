
import static java.lang.Integer.max;
import static java.lang.Integer.min;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class ArrayExperiment {
    public static void main(String [] args){
        int[] grades = {69, 78, 54, 35, 68 ,71};
        
        for (int index=0; index < grades.length; index++){
            System.out.printf("Grades at position %d is %d%% %n", index, grades[index]);
        }
        // this does the same thing with a "for each loop"
        for (int specificGrade: grades){
            System.out.printf("%d%% %n", specificGrade);
        }
        System.out.printf("The average grade is %.0f%%", getAverage(grades));
      
    }// end of main method
    /**
     * This method will add up all the element in the array
     * and divide it by the number of elements to return the average
     */
   public static double getAverage(int[] arrayOfInts){
     int sum = 0;
     for(int index= 0; index<arrayOfInts.length; index++){
         sum = sum + arrayOfInts[index];
     }
     return (double) sum / arrayOfInts.length;
   }
     
}
