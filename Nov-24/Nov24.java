package nov24;

/**
 *
 * @author jwright
 */
public class Nov24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //challenge 1
        System.out.print("I am getting good at finding and fixing errors!!\n");
        
        //challenge 2
        System.out.print("It makes coding so much easier when you can debug code\n");                
                
       
        //challenge 3
       int[] weight = {110, 111, 140, 190, 200, 210};
       int weight2 = 50;
       System.out.printf("The average of the weights is %.2f lbs%n%n", getAverage(weight));
       
       
       //challenge 4
       String[][] daysAndLyrics = new String[7][2];
       daysAndLyrics[0][0] = "Monday";
       daysAndLyrics[0][1] = "Rainy days and Mondays always get me down...";
       daysAndLyrics[1][0] = "Tuesday";
       daysAndLyrics[1][1] = "Got the club goin' up, on a Tuesday";
       daysAndLyrics[2][0] = "Wednesday";
       daysAndLyrics[2][1] = "Listen to Wednesday's song";
       daysAndLyrics[3][0] = "Thursdsay";
       daysAndLyrics[3][1] = "Thursday then friday, it's soon gonna be the weekend";
       daysAndLyrics[4][0] = "Friday";
       daysAndLyrics[4][1] = "It's Friday, Friday ... Gotta get down on Friday";
       daysAndLyrics[5][0] = "Saturday";
       daysAndLyrics[5][1] = "Sudbury Saturday Night";
       daysAndLyrics[6][0] = "Sunday";
       daysAndLyrics[6][1] = "Sunday morning, rain is falling";
       display2DArray(daysAndLyrics);
       
    }  /**
     * This method will traverse over a 2D array and display the contents
     */
    public static void display2DArray(String[][] twoDArray)
    {
        for (int row = 0; row < twoDArray.length; row++)
        {
            for (int col = 0; col < twoDArray[row].length; col++)
            {
                System.out.printf("%s ", twoDArray[row][col]);
                if (col ==0)
                    System.out.printf("- ");
            }
            System.out.println();
        }
    }
  
    

    //challenge 5
    public void yeeHaw(){
    System.out.print("yee haw!");
    
    }
  


  /**
     * This method will return the average of the integer array as a double
     */
    public static double getAverage(int[] intArray)
    {
        int sum = 0;
        for (int i=0; i<intArray.length; i++)
        {
            sum += intArray[i];
        }
        return(double) sum/intArray.length;
    }
}