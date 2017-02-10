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
public class StudentTest {
 
     public static void main(String[] args) {
        Student account1 = new Student("Mike", 97.5);
        Student account2 = new Student("Hua", 88.8);
        
        System.out.printf("%s's letter grade is %d/n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is %d/n",
                account2.getName(), account2.getLetterGrade());
    }
}
