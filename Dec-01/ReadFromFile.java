/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class ReadFromFile {
    public static void main(String [] args) throws FileNotFoundException{
        File fileToRead = new File ("harambe.txt");
        Scanner fileReader = new Scanner(fileToRead);
        
        while(fileReader.hasNext()){
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
    }
}
