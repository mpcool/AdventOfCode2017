import java.util.*;
import java.io.*;

public class DayTwoB {
 
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
            for(int c = 0; c < spreadsheet[r].length; c++) {
                for(int i = c + 1; i < spreadsheet[r].length; i++) {
                    if(spreadsheet[r][c] % spreadsheet[r][i] == 0) {
                        System.out.println("\n\n[" + r + "][" + c + "]: " + spreadsheet[r][c]);
                        System.out.print("[" + r + "][" + i + "]: " + spreadsheet[r][i]);
                        totalSum += spreadsheet[r][c]/spreadsheet[r][i];
                    }
                    if(spreadsheet[r][i] % spreadsheet[r][c] == 0) {
                        System.out.println("\n\n[" + r + "][" + c + "]: " + spreadsheet[r][c]);
                        System.out.print("[" + r + "][" + i + "]: " + spreadsheet[r][i]);
                        totalSum += spreadsheet[r][i]/spreadsheet[r][c];
                    }
                }
            }
        }
      
        System.out.println("Sum: " + totalSum);
    }
    
}