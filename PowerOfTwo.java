// Question 3: Power of Two
// Write a program that takes an integer as input and returns true if the input is a power of two.
// Examples:
// 8=> returns true
// 6=> returns false


import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            boolean bool = checkValidity(num);
            System.out.println(bool);
        }
        catch(Exception e){
            System.out.println("Please enter a number!!");
        }
    }

    public static boolean checkValidity(int num){
        if(num%2 != 0) return false;

        while(num%2 == 0){
            num = num / 2;
            if(num == 1) return true;
        }
        
        return false;
    }
}
