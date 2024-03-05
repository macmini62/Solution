// Question 4: Capitalize Words
// Write a program that accepts a string as input, capitalizes the first letter of each word in the
// string, and then returns the result string.
// Examples:
// "hi"=> returns "Hi"
// "i love programming"=> returns "I Love Programming"


import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a string to capitalize: ");
            String str = sc.nextLine();
            
            String[] words = str.split(" ");
            String capitalize = "";

            for(String word : words){
                capitalize += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }

            System.out.println(capitalize);
        }
    }
}
