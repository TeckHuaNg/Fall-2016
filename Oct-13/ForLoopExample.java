/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct13;

/**
 *
 * @author Michael
 */
public class ForLoopExample {
    public static void main(String [] args)
    {   //initial state   //check condition  //how it changes each time
        for(int count=1; count <= 10; count++)
        {
            System.out.println(count);
        }
        
        //write a for loop that will count from 100 to 1
        
        for (int count=100; count>=1; count--)
        {
            System.out.println(count);
        }
        
        //create a "times table" that is 10x10
        for(int row = 1; row <= 10; row++)
        {
            for (int column = 1; column <=10; column++)
        {
            System.out.printf("%4d",row*column);
        }
            System.out.println();
        }
    }
}
