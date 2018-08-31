import java.util.*;
import java.io.*;

public class DayOneB {
    
    public static void main(String[]args) {
        int sum = 0;
        String numString="";
        try {
            Scanner file = new Scanner(new File("day1_input.txt"));
            numString = file.next();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        
        for(int i = 0; i < numString.length()/2 - 1; i++) {
            if(numString.substring(i, i+1).equals(numString.substring(numString.length()/2 + i, numString.length()/2 + i + 1))) {
                sum+=Integer.parseInt(numString.substring(i,i+1));
            }
        }
        System.out.println(sum * 2);
    }
    
}