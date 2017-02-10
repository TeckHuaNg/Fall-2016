/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov17;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Warmup {
    public Warmup(){
        
        
    }
    
    public static void main(String [] args){
        
        
        Warmup exp = new Warmup();
       
        exp.getWords();
     }
    
    
    public void getWords(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter a num: ");
        int num = keyboard.nextInt();
        
        String[] wordList = new String[num];
        
        for(int count=0; count< wordList.length;count++){
            System.out.print("Please enter a word: ");
            wordList[count] = keyboard.nextLine();
        }
}
    
    
}
