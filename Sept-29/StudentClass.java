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
public class StudentClass {
    private String firstname, lastname, emailAddress, major;
    private int studentNum;
    private LocalDate dateofBirth;
    
    public StudentClass(String fName, String lName, String email, String major,int StuNum,
            LocalDate dateofBirth)
    {
        firstname = fName;
        lastname = lName;
        emailAddress = email;
        this.major = major;
        studentNum = StuNum;
        this.dateofBirth = dateofBirth;
    }
    
    public String toString()
    {
        return firstname = "" + lastname ;
    }
    public int getAge()
    {
        int age = LocalDate.now().getYear() - this.dateofBirth.getYear();
        return age;
    }
}
