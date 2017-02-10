/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov24;

/**
 *
 * @author Michael
 */
public class StringExperiment {
    public static void main(String[] args){
        String myName = "Mike";
        System.out.printf("My name has %d characters.%n", myName.length());
        System.out.printf("My first initial is %c", myName.charAt(0));
        
        //Create a variable to hold your last name
        //Using your first name and last name, print your initials to the screen
        String lastName = "Ng";
        System.out.printf("%n%c.%c.",myName.charAt(0),lastName.charAt(0));
        
        //using a for loop display all the letters of your first, but 
        //only put 1 letter on each line
        for(int i=0; i<myName.length();i++){
            System.out.printf("%n%c",myName.charAt(i));
        }
        
        //put your name in a 2 dimensional array so that it display on a diagonal
        //for example "Jaret" would display as
        //J
        //  A
        //    R
        //      E
        //        T
        char[][] name = new char[myName.length()][myName.length()];
        for(int i=0; i<myName.length();i++){
                name[i][i]=myName.charAt(i);
        }
        
        //now we need to display 2d array
        for(int row=0; row<name.length;row++){
            for(int col=0; col<name.length; col++){
                if(name[row][col] != 0)
                    System.out.print(name[row][col]);
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        
        String email = "JDub@GC.org";
        System.out.printf("The string %s contains '@GC' is a %b statement", email, email.contains("@GC"));
        System.out.printf("The string %s contains 'break time' is a %b statement", email, email.contains("break time"));
        
        System.out.print("Ja"+"ret"+"\n");
        System.out.printf("%s%n", myName.concat(lastName));
        
        System.out.printf("The position of the letter '@' in %s is %d%n", email, email.indexOf("@"));
        
        System.out.printf("Here is the org info from the email address: %s%n", email.substring(email.indexOf("@")));
        System.out.printf("%s position 2-4 are: %s%n", email, email.substring(2, 4));
        
        System.out.printf("%s ends with .com is %b%n", email, email.endsWith(".com"));
        System.out.printf("My name in Upper case is %s%n", myName.toUpperCase());
        System.out.printf("My name in Lower case is %s%n", myName.toLowerCase());
        
        String space = "fox ";
        System.out.printf("'%s' after it is trimmed is '%s'%n", space, space.trim());
    }
}
