/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Michael
 */
public class Student{
    
    private String name;
    private double average;
    
    //constructor initialize instance variables
    public Student(String name, double average)
    {
        this.name = name;
        
        //validate that average is > 0.0 and <= 100.0 ,otherwise
        //keep instance variable average's default value (0.0)
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average; // assign to instance variable
        
    }
    //sets the student name
    public void setName(String name)
    {
        this.name = name;
    }
    
    //retrieve the student name
    public String getName()
    {
        return name;
    }
    
    //sets the student average
    public void setAverage(double studentAverage)
    {
        //validate that average is > 0.0 and <= 100, otherwise
        //keep instance variable average's current value
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }
    //retrieve student average
    public double getAverage()
    {
        return average;
    }
    //determines and return the student letter grade
    public String getLetterGrade()
    {
        String letterGrade = "";// initialize to empty string
        
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";
        
        return letterGrade;
    }
    
  
    
}
