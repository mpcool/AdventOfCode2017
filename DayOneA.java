import java.util.*;
import java.io.*;

public class DayOneA {
    
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
        for(int i = 0; i < numString.length() - 1; i++) {
            if(numString.substring(i, i+1).equals(numString.substring(i+1, i+2))) {
                sum+=Integer.parseInt(numString.substring(i,i+1));
            }
        }
        if(numString.charAt(0) == numString.charAt(numString.length() - 1)) {
            sum+=Integer.parseInt(numString.substring(0,1));
        }
        System.out.println(sum);
    }
    
}