/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec08;

/**
 *
 * @author Michael
 */
public class Student {
    private String fname, lname;
    private int studentNum;
    private double avgMark;
    public Student(String fname, String lname, int stuNum ,double mark){
        this.fname = fname;
        this.lname = lname;
        studentNum = stuNum;
        avgMark = mark;
    }
    
    public String toString(){
        return fname;
    }
    public String modifiedToString(){
        return fname + " " + lname;
    }
    public double getAverageMark(){
        return avgMark;
    }
    
}
