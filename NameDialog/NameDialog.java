/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namedialog;

/**
 *
 * @author Michael
 */
import javax.swing.JOptionPane;
public class NameDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //prompt user to enter name
        String name = JOptionPane.showInputDialog("What is your name?");
        
        //create the message
        String message = 
                String.format("Welcome %s, to Java Programming", name);
        
        //display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
    
}
