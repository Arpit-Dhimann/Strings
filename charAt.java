//PROBLEM: Input a string from the user. Create a new string called ‘result’ in which you 
//         will replace the letter ‘e’ in the original string with letter ‘i’. 
//         Example : Original = “eabcdef’ ; result = “iabcdif”


import java.util.*;

public class charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr ->'eabcdef'<- as String : ");
        String str = sc.next();
        // Initialize an empty string to store the final result
        String result = "";

        // Iterate through the input string character by character
        for(int i=0 ; i<str.length() ; i++){
            // Check if the current character is 'e'
            if(str.charAt(i) == 'e'){
                // Replace 'e' with 'i' in the result string
                result += 'i';
            }
            else {
                // If it's not 'e', keep the original character
                result += str.charAt(i);
            }
        }
        // Print the final modified string
        System.out.println("After replacing 'e' with 'i' : " + result);
        // Close the scanner to prevent memory leaks
        sc.close();
    } 
}
