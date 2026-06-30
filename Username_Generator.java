//PROBLEM: Input an email from the user. You have to create a username 
//         from the email by deleting the part that comes after ‘@’. 
//         Display that username to the user.
//         Example : email = “ABCD@gmail.com” ; username = “ABCD”


import java.util.*;

public class Username_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email here : ");
        String email = sc.next();
        // This will hold the username part
        String UserName = "";

        // Loop through each character of the email
        for(int i=0 ; i<email.length() ; i++){
            // If we find the '@' symbol, stop the loop
            if(email.charAt(i) == '@'){
                break;
            }
            // Otherwise, add the character to our username
            else {
                UserName += email.charAt(i);
            }
        }
        // Print the extracted username
        System.out.println("User name is : " + UserName);
        // Close the scanner to prevent memory leaks
        sc.close();
    }
    
}
