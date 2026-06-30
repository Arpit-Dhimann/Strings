//PROBLEM: Take an array of Strings input from the user & find the cumulative (combined) 
//         length of all those strings.

import java.util.*;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        
        // Declare a String array to hold the inputs
        String[] arr = new String[size];
        // Variable to keep track of the total character count
        int cumulativeLength = 0;

        // Loop to capture each string and add its length to the total
        for(int i=0 ; i<size ; i++){
            System.out.print("Enter string at " + (i+1) + " postion : ");
            arr[i] = sc.next();
            // Add the length of the current string to the accumulator
            cumulativeLength += arr[i].length();
        }
        // Display the final combined length
        System.out.print(" Cumulative Length of string : " + cumulativeLength);
        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
