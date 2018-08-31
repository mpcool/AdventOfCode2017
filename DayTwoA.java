import java.util.*;
import java.io.*;

public class DayTwoA {
 
    public static void main(String[]args) {
        int[][] spreadsheet = new int[16][16];
        
        try {
            Scanner file = new Scanner(new File("day2_input.txt"));
            int countX = 0, countY = 0;
            while(file.hasNextInt()) {
                spreadsheet[countY][countX++] = file.nextInt();
                if(countX > 15) {
                    countX = 0;
                    countY++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int totalSum = 0;
        for(int r = 0; r < spreadsheet.length; r++) {
            int min = spreadsheet[r][0], max = min;
            for(int c = 0; c < spreadsheet[r].length; c++) {
                System.out.print(spreadsheet[r][c] + "\t\t");
                if(min > spreadsheet[r][c])
                    min = spreadsheet[r][c];
                if(max < spreadsheet[r][c])
                    max = spreadsheet[r][c];
            }
            totalSum += (max - min);
            System.out.println();
        }
      
        System.out.println(totalSum);
    }
    
}