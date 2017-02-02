/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package accounttest;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Account account1 = new Account();
       Account account2 = new Account();
       
       //display initial balance of each object
       System.out.printf("%s balance: $%.2f%n" , account1.getName(), account1.getBalance());
       System.out.printf("%s balance: $%.2f%n" , account2.getName(), account2.getBalance());
       
       //create a Scanner to obtain input from the command window
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter deposit amount for account1: ");
       double depositAmount = input.nextDouble();
       System.out.printf("%nadding %.2f to account1 balance%n%n" , depositAmount);
       account1.deposit(depositAmount); //add to account1's balance
       
       //display balances
       System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
       System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
       
       System.out.print("Enter deposit amount for account2: ");
       depositAmount = input.nextDouble();
       System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
       account2.deposit(depositAmount);
       
       //display balances
       System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
       System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
       
    }
    public double getBalance(int bNum)
            {
                System.out.print("Please enter your balance: ");
                Scanner keyboard = new Scanner (System.in);
                return keyboard.nextDouble();
            }
    




}
