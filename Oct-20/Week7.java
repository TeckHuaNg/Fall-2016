
import java.security.SecureRandom;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Week7 {
      public static void main(String[] args)
    {
        /**
         * Question 1 - in the space below write a while loop that will display the numbers 1 - 10 on the screen
         */
		 System.out.println("Question 1");
                 int count = 1;
                 while (count <= 10)
        {   if(count != 10)
            System.out.printf("%d,", count);
            else
            System.out.printf("%d",count);
            count++;
        }   
                 
        
        
        /**
         * Question 2 - in the space below write a while loop that will display the numbers 0 - 10 on the screen, going up by 2's
         * for example 0, 2, 4, 6, 8, 10
         */
         System.out.printf("%nQuestion 2");
          System.out.println();
         count = 0;
         while (count <= 10){
             if(count != 10)
                 System.out.printf("%d,", count);
             else
                 System.out.printf("%d", count);
             count= count +2;
         }
         
         
        
        /**
         * Question 3 - in the space below write a while loop that will display the numbers 3-33 on the screen, going up by 3's
         * for example 3, 6, 9, ... 33
         */
		 System.out.printf("%nQuestion 3");
                 System.out.println();
                 count = 3;
                 while (count <=33){
                     if (count != 33)
                        System.out.printf("%d,",count);
                     else
                         System.out.printf("%d",count);
                     count = count +3;
                 }
         
         
        
        /**
         * Question 4 - in the space below write a while loop that will display the numbers 33-3 on the screen, going down by 3's
         * for example 33, 30, 27, ... , 6, 3
         */
		 System.out.printf("%nQuestion 4");
                 System.out.println();
                  count = 33;
                 while (count>=3){
                     if (count!=3)
                         System.out.printf("%d,",count);
                     else
                         System.out.print(count);
                     count -= 3;
                 }        
       
        /**
         * Question 5 - in the space below write a do...while loop that will display the numbers 1-10 on the screen, going up by 1's
         * for example 1, 2, 3, ... 10
         */
		 System.out.printf("%nQuestion 5");
                 System.out.println();
                 count =1 ;
                 do{
                     if(count!=10)
                        System.out.printf("%d,", count);
                     else 
                         System.out.printf("%d", count);
                     ++count;
                 }while(count <=10);
        
        /**
         * Question 6 - in the space below write a do...while loop that will display the numbers 0-12 on the screen, going up by 4's
         * for example 0, 4, 8, 12
         */
                 System.out.printf("%nQuestion 6");
                 System.out.println();
                 count = 0;
                 do{
                     if(count!=0)
                     System.out.printf(",%d", count);
                     else
                         System.out.print(count);
                     count += 4;
                    }while(count<=12);
        /**
         * Question 7 - in the space below write a for loop that will display the numbers 1 - 10 on the screen
         */
         System.out.printf("%nQuestion 7");
         System.out.println();
        for(count=1; count<=10;count++){
            if (count!=1)
                System.out.printf(","+ count);
            else
                System.out.print(count);
        }
        /**
         * Question 8 - in the space below write a for loop that will display the numbers 0 - 10 on the screen, going up by 2's
         * for example 0, 2, 4, 6, 8, 10
         */
         System.out.println();
         System.out.printf("Question 8%n");
        
         for(count=0; count<=10;count+=2){
             if(count!=10)
                 System.out.printf("%d,",count);
             else
                 System.out.print(count);
         }
        
        /**
         * Question 9 - in the space below write a for loop that will display the numbers 3-33 on the screen, going up by 3's
         * for example 3, 6, 9, ... 33
	*/	 
        System.out.println();
        System.out.printf("Question 9%n");
        
                 for(count=3; count<=33;count+=3){
                     if(count!=33)
                         System.out.printf("%d,",count);
                     else
                         System.out.print(count);
                 }
        
        
        /**
         * Question 10 - in the space below write a for loop that will display the numbers 33-3 on the screen, going down by 3's
         * for example 33, 30, 27, ... , 6, 3
         */
         System.out.printf("%nQuestion 10%n");
       
        for(count=33; count>=3; count -=3){
            if (count!=3)
                System.out.printf("%d,",count);
            else
                System.out.print(count);
        }
        
        /**
         * Question 11 - create a method called "invalidPassword" accepts a String as an argument and returns true if the password is invalid, false otherwise.  The 
         * valid password is "happy".
         */
         System.out.printf("%nQuestion 11%n");
         
         

         
        
        /**
         * Question 12 - using a while loop and the invalidPassword method from question 7, setup a loop that will keep asking the user 
         * for a password until they put in the correct password
         */
         System.out.printf("Question 12%n");
         Scanner keyboard = new Scanner(System.in);
         String password;
         System.out.print("Enter password: ");
         password = keyboard.nextLine();
         
         
        
            
             while (invalidPassword(password)){
            System.out.print("Enter password: ");
            password = keyboard.nextLine();
            
            }
        
         
        
        /**
         * Question 13 - using a do .... while loop and the invalidPassword method from question 7, setup a loop that will keep asking the user 
         * for a password until they put in the correct password
         */
         System.out.printf("Question 13%n");
         
         do{
             System.out.print("Enter password: ");
             password = keyboard.nextLine();
         }while(invalidPassword(password));
        
        
        /**
         * Question 14 - this will be a simple number guessing game.  Have the computer select a random number between 1 and 10.  Continuously
         * ask the user to guess the number.  If the user guesses the correct number, the screen should display "correct, it took you X attempts to guess
         * correctly" (where X is the # of attempts)
         */
        System.out.printf("Question 14%n");
        SecureRandom rng = new SecureRandom();
        int num;
        int i = 0;
        
        int number = rng.nextInt(10)+ 1;
   
        do{
            System.out.print("Enter a number from 1 to 10: ");
            num = keyboard.nextInt();
            i++;
        }while(number != num);
        System.out.printf("Correct, it took you %d attempts to guess correctly%n%n", i);
        
        
        
        /**
         * Question 15 - Write a method called "hasTeen".  The method should accept 3 integers as arguments.  The method should return true
         * if any of the arguments are in the range 13-19, false otherwise.  Use the code below to test your method.
         */
		 System.out.printf("Question 15%n");
        System.out.printf("The method hasTeen(10, 40, 17) returns %b (should be true)%n", hasTeen(10,40,17));
        System.out.printf("The method hasTeen(10, 17, 50) returns %b (should be true)%n", hasTeen(10,17,50));
        System.out.printf("The method hasTeen(13, 10, 50) returns %b (should be true)%n", hasTeen(13,10,50));
        System.out.printf("The method hasTeen(13, 17, 19) returns %b (should be true)%n", hasTeen(13,17,19));        
        System.out.printf("The method hasTeen(12, 20, 6)  returns %b (should be false)%n", hasTeen(12,20,6));
        
        
        
        
        /**
         * Question 16 - Create a method that will prompt the user to enter 10 numbers.
         * There should be a prompt for each number.  Once the user has entered
         * all 10 numbers, the computer should return the highest number entered
         */
         System.out.printf("%nQuestion 16%n");
        
         System.out.printf("The highest number is %d",highestNum());
         
        
    }
      
      public static boolean invalidPassword(String pw){
         if(pw.equals("happy"))
           return false;
         else  {
            System.out.printf("Sorry, that password is invalid%n");
            return true;
        }
      }
      
      public static boolean hasTeen(int x, int y, int z){
          if ((x>=13)&&(x<=19))
              return true;
          else if ((y>=13)&&(y<=19))
              return true;
          else if ((z>=13)&&(z<=19))
              return true;
          else
              return false;
              
      }
      public static int highestNum(){
         int numEnter;
         int largest =0;
         
         for(int c=1; c<=10; c++){
             System.out.print("Enter a number: ");
             Scanner keyboard = new Scanner(System.in);
             numEnter = keyboard.nextInt();
            if(numEnter>largest)
                largest=numEnter;
             }
         return largest;
      }
    
      
}
      
       
      
   
