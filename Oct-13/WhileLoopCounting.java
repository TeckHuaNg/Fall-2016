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
public class WhileLoopCounting {
    public static void main (String[]args)
    {
        int count = 1;
        
        while (count <= 100)
        {
            System.out.println(count);
            count++;
        }
        //create a loop that will count from 100 to 1
        
        while (count >= 1){
            System.out.println(count);
            count--;
        }
        count = 49;
        //create a loop that will count from 49 to 0 going in steps of 7
        while (count >= 0 ){
            System.out.println(count);
            count = count - 7;
        }
        
        
    }
}
