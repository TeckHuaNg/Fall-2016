/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept29;

import java.time.LocalDate;


/**
 *
 * @author Michael
 */
public class StudentTesting {
    public static void main (String [] args)
    {
        StudentClass kevin = new StudentClass("Kevin", "Mitchell", "km@corporata.com",
        "COPA", 123456789, LocalDate.of(1987,01,01) );
        
        System.out.printf("Our first student is: %s%n", kevin.toString());
        
        StudentClass mansi = new StudentClass("Mansi", "Patal", "mp@corporata.com",
        "COPA", 10006548, LocalDate.of(1989,02,01) );
        
        System.out.printf("Our second student is: %s%n", mansi.toString());
        System.out.printf("%s is %d years old%n", kevin.toString(), kevin.getAge());
        System.out.printf("%s is %d years old%n", mansi.toString(), mansi.getAge());
        
        //double avg = getAverageAge(kevin, mansi);
    }
    
}
