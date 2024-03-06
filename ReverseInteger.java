// Question 5: Reverse Integer
// Write a program that takes an integer as input and returns an integer with reversed digit ordering.
// Examples:
// For input 500, the program should return 5.
// For input -56, the program should return -65.
// For input -90, the program should return -9.
// For input 91, the program should return 19.

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("input number: ");
            int input = sc.nextInt();

             int reversed = reverse(input);
             System.out.println(reversed);
        }
    }

    public static int reverse(int num){
        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
