package sept22;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class GoFetch 
{
    //This is the method header
    public static void main(String[] args)
    {
        System.out.print("What's your favourite app?");
        
        Scanner keyboard = new Scanner(System.in);
        String appName1 = keyboard.nextLine();
        
        System.out.print("what is your name?");
        String name = keyboard.nextLine();
        
        System.out.printf("Hello %s , it's nice to work with you and your favourite app is%s!%n" , name ,appName1);
        
        //This will call the method fetchHeadline() and return a string
        //with the headline in it
        String headline = fetchHeadline();
    
        
        //Print the results
        System.out.printf("Today's head line is %s%n", headline);
        
        System.out.printf("Another head is %s", fetchHeadline());
    }
       /** This method will prompt user for a headline and return it
        * to the calling function
        * @return 
        */
         
       public static String fetchHeadline()
         {
         System.out.printf("%n%nEnter today's headline: ");
         Scanner keyboard = new Scanner(System.in);
         
         String headline = keyboard.nextLine();
         return headline;
         
         }
        
    }

