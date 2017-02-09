/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class WordSearch2 extends Application implements EventHandler<ActionEvent>{
    private Stage window;
    private Scene scene2, scene3; //create 3 scenes to change
    private ListView<String> listView;
    private TextField wordInput;
    private int num;
    private char[][] crossWord;
    private ArrayList<String> wordList;
    private VBox layout3 = new VBox();
    private Label label2;
   
    
    @Override
    public void start(Stage primaryStage) {
        label2 = new Label();
        label2.setPadding(new Insets(5,5,5,5));
        label2.setFont(Font.font("Monospace"));
        Spinner<Integer> spinner = new Spinner(5,20,5); //create spinner object 
        wordList = new ArrayList<>();
        
        Button button = new Button("Create Puzzle");//create a button that for scene 1
        button.setOnAction(e -> {
            num = spinner.getValue();//get value from spinner
            crossWord = new char [num][num];//create 2d array 
            primaryStage.setScene(scene2);
            primaryStage.setTitle("Add words to puzzle");
        });//set scene2 and get number of words
        
        GridPane grid = new GridPane();//create grid layout
        grid.setHgap(10);
        grid.setVgap(10);
        
        //Place spinner and label together
        grid.add(new Label("Size of puzzle"), 0, 0);
        grid.add(spinner, 1, 0);
        grid.add(button, 0, 2);
        
        //Create listView
        listView = new ListView<>();
        listView.setPadding(new Insets(10,10,10,10));
        
        //Word Input
        wordInput = new TextField();
        wordInput.setPromptText("Word");
        wordInput.setMinWidth(200);
        
        //Create label to show exception thrown
        Label label = new Label();
        label.setPadding(new Insets(5,5,5,5));
        
        //Add Button
        Button addButton = new Button("Add word to puzzle");
        addButton.setOnAction(e -> {
            addButtonClicked(label);
            if(wordList.size() == num){
               primaryStage.setScene(scene3);
               primaryStage.setTitle("CrossWord Puzzle complete!!!");
               label2.setText(verticalString());                     }     
            });
        
         //vertical words button
        Button vButton = new Button("Vertical Words");
        vButton.setOnAction(e -> {
            label2.setText(verticalString());
                });
        
         //horizontal words button
        Button hButton = new Button("Horizontal Words");
        hButton.setOnAction(e -> {
            label2.setText(horizontalString());
                });
        
        //Save to file button
        Button saveButton = new Button("Save to File");
        saveButton.setOnAction(e -> saveFile());
        
        //Horizontal Box
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(wordInput, addButton);
        
        //Horizontal Box for layout3
        HBox hBox2 = new HBox();
        hBox2.setPadding(new Insets(10,10,10,10));
        hBox2.setSpacing(10);
        hBox2.getChildren().addAll(saveButton,hButton, vButton);
        
        //layout2
        VBox layout2 = new VBox();
        layout2.getChildren().addAll(hBox, listView, label);
        scene2 = new Scene(layout2,450,400);
        
        //layout3
        layout3.getChildren().addAll(label2 , hBox2);
        scene3 = new Scene(layout3, 500, 500);
         
        //scene 1
        Scene scene = new Scene(grid, 350,150);
        primaryStage.setTitle("Assignment 2 Gui");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This method will add String from the text field, entered by user to wordList array and list view
     * If the word is not valid, label will show error message
     * @param label 
     */
    public void addButtonClicked(Label label){
        try{
        String newWord = validateWord(wordInput.getText().trim().toUpperCase());
        wordList.add(newWord.toUpperCase());
        listView.getItems().add(newWord);
        wordInput.setStyle("-fx-text-box-border: transparent");
        wordInput.clear();
        label.setText("");
        } catch (IllegalArgumentException e){
            String warning = String.format("%s", e.getMessage());
            label.setText(warning);
            wordInput.setStyle("-fx-text-box-border: red");
        }
    
    }
    /**
     * This method will validate words entered by user and throw argument exception if not valid
     * This method contains all the logic for words to be valid
     * @param word
     * @return 
     */
    public String validateWord(String word){
            
            if(word.equals(""))
                throw new IllegalArgumentException("Please enter a word");
            if(word.length()>num)
                throw new IllegalArgumentException(word + " is too long, it must be "+ num + " characters long.");
            if(word.length() == 1)
                throw new IllegalArgumentException(word + " is too short, it must be at least 2 characters long");
            if(word.contains(" "))
                throw new IllegalArgumentException(word + " has spacing");
            if(wordList.size()>0){
                for (int i=0; i<wordList.size(); i++) {
                    if(word.equalsIgnoreCase(wordList.get(i)))
                        throw new IllegalArgumentException(word + " is a duplicate"); 
                }
        }
            return word;
    }
    /**
     * This method will insert words VERTICALLY from array to the puzzle grid
     * Empty spaces in puzzle grid will be filled by random letters
     */
    public void verticalWords(){ 
        SecureRandom rng = new SecureRandom();
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                   'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        //insert words from list to puzzle grid
        for(int i=0; i<wordList.size();i++){
            String word = wordList.get(i);
            int random;
            if(num - word.length() == 0)
                random = 0;
            else
                random = rng.nextInt(num - word.length()+1);
            for(int j=0; j<word.length(); j++){
                crossWord[random][i] = word.charAt(j);
                random++;
            }
        }
        
        //insert alphabet into grid
        for (int row=0; row<crossWord.length;row++){
            for(int col=0;col<crossWord.length;col++){
                 int alpha = rng.nextInt(26);
                if (crossWord[row][col] == 0)
                    crossWord[row][col] = letters[alpha];
                  }
        }
    }   
    /**
     * This method will insert words HORIZONTALLY from array to the puzzle grid
     * Empty spaces in puzzle grid will be filled by random letters
     */
    public void horizontalWords(){ 
        SecureRandom rng = new SecureRandom();
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                   'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        //insert words from list to puzzle grid
        for(int i=0; i<wordList.size();i++){
            String word = wordList.get(i);
            int random;
            if(wordList.size() - word.length() == 0)
                random = 0;
            else
                random = rng.nextInt(wordList.size() - word.length()+1);
            for(int j=0; j<word.length(); j++){
                crossWord[i][random] = word.charAt(j);
                random++;
            }
        }
        
        //insert alphabet into grid
        for (int row=0; row<crossWord.length;row++){
            for(int col=0;col<crossWord.length;col++){
                 int alpha = rng.nextInt(26);
                if (crossWord[row][col] == 0)
                    crossWord[row][col] = letters[alpha];
                  }
        }
    }  
    /**
     * This method will store word list and vertical crossword puzzle as a String and return them
     * @return 
     */
    public String verticalString(){ //create vertical crossWord puzzle
         Collections.sort(wordList);
         String str = "";
         for(String element : wordList){
             str += String.format("%s%n", element);
         }
        
        verticalWords();
        String grid = "";
        for (char[] crossWord1 : crossWord) {
            for (int col = 0; col<crossWord.length; col++) {
                grid += String.format("%3s", crossWord1[col]);
            }
            grid += String.format("%n");
        }
         return String.format("%s%n%nHere are the words to find:%n%s",grid, str);
     }   
    /**
     * This method will store word list and horizontal crossword puzzle as a String and return them
     * @return 
     */
    public String horizontalString(){ //create horizontal crossWord puzzle
         Collections.sort(wordList);
         String str = "";
         for(String elements : wordList){
             str += String.format("%s%n", elements);
         }
         
        horizontalWords();
        String grid = "";
        for (char[] crossWord1 : crossWord) {
            for (int col = 0; col<crossWord.length; col++) {
                grid += String.format("%3s", crossWord1[col]);
            }
            grid += String.format("%n");
        }
         return String.format("%s%n%nHere are the words to find:%n%s",grid,str);
     }
    /**
     * This method will allow you to choose directory to save cross word puzzle in text file
     */
    public void saveFile(){// save file method
       FileChooser fileChooser = new FileChooser();
  
              //Set extension filter
              FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
              fileChooser.getExtensionFilters().add(extFilter);
              
              //Show save file dialog
              File file = fileChooser.showSaveDialog(window);
              
              String content = String.format("%s", label2.getText());
             if(file != null){
                  sFile(content, file);
            }
    }
     
    /**
     * This method will write the string into a text file
     * and store them to chosen directory 
     * @param content
     * @param file 
     */
    public void sFile(String content, File file){//write to text file
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            System.err.printf("%s", ex);
        }
         
    }
    
}//end of class
