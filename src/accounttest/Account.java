package accounttest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Account {
    private double balance;
    private String name;
    
    public Account()
    {
        name = "Mike";
        balance = 1000000.45;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void deposit(double depositAmount)
    {
        if (depositAmount >= 0)
            balance += depositAmount;
        else
            System.out.print("Deposits must be positiive.");
    }
}
