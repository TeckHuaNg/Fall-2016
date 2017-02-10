/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov17;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class TicTacToe {
    String[][] puzzleGrid;
 
    public TicTacToe(){
        puzzleGrid = new String[3][3];
        
        for( int row=0; row<puzzleGrid.length;row++){
            Arrays.fill(puzzleGrid[row]," ");
        }
    }

    /**
     * This method will display puzzle grid to the grid
     */
    public void displayPuzzle(){
        for(int row=0; row<puzzleGrid.length;row++){
            for(int col=0; col<puzzleGrid[row].length;col++){
                if(col==2)
                    System.out.printf(" %s ",puzzleGrid[row][col]);
                else
                    System.out.printf(" %s |", puzzleGrid[row][col]);
            }
            if(row!=2)
                System.out.print("\n-----------\n");
            else
                System.out.println();
        }
    }//end of displayPuzzle method
    /*
    This method will allow a player to place an X or O
    in the playing grid
    */
    public void makeMove(String player, int row, int col){
        if(row <0 || row>2 || col<0 || col>2)
            throw new IllegalArgumentException("valid rows/cols are in the range 0-2");

        //check if the space is free
        if (puzzleGrid[row][col].equals(" "))
            puzzleGrid[row][col] = player;
        else
            throw new IllegalArgumentException("position ["+row+"]["+col+"] is taken");
    }
    /*
    This method will return true if there are open positions on gameboard
    */
    public boolean boardHasOpenSpots(){
        for(int row=0; row<puzzleGrid.length;row++){
            for(int col=0; col<puzzleGrid.length; col++){
                if (puzzleGrid[row][col].equals(" "))
                    return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        TicTacToe myPuzzle = new TicTacToe();
        String currentPlayer = "X";
        Scanner keyboard = new Scanner(System.in);
        
        while (myPuzzle.boardHasOpenSpots() && myPuzzle.noWinnerYet()){
            myPuzzle.displayPuzzle();
            System.out.printf("Player %s, enter a row (0-2): ",currentPlayer);
            int row = keyboard.nextInt();
            System.out.printf("Player %s, enter a col (0-2): ",currentPlayer);
            int col = keyboard.nextInt();
        try{
            myPuzzle.makeMove(currentPlayer, row, col);
        }catch(IllegalArgumentException zacsException){
            System.out.printf("Sorry that was invalid input: %s%n", zacsException);
            System.out.printf("Please enter a new row: ");
          
            row = keyboard.nextInt();
            System.out.printf("Please enter a new col: ");
            col = keyboard.nextInt();
            myPuzzle.makeMove(currentPlayer, row, col);
        }
        if (currentPlayer.equals("X"))
            currentPlayer = "O";
        else
            currentPlayer = "X";
        }
        
        
        
        
        
    }
    /**
     * This method will search the puzzle looking for winner
     */
    public boolean noWinnerYet(){
        //check for a horizontal win
        for(int row=0; row<puzzleGrid.length; row++){
            String rowContents = puzzleGrid[row][0] + puzzleGrid[row][1] + puzzleGrid[row][2];
            if (rowContents.equals("XXX") || rowContents.equals("OOO"))
                    return false;
        }
        return true;
    }
}
