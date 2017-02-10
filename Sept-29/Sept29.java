/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept29;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Sept29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = getNum(1);
        double num2 = getNum(2);
        
        double sum = getSum(num1, num2);
        System.out.printf("Result= %.0f",sum);
    }
    public static double getNum(int num)
    {
        System.out.print("Enter your first number ");
        Scanner keyboard = new Scanner (System.in);
        return keyboard.nextDouble();
    }
    public static double getSum(double num1, double num2)
    {
        return (num1 + num2);
    }
}
