// Question 2: Fibonacci Sequence
// Write a program to generate the Fibonacci sequence up to 100.

public class FibonacciSequence {
    public static void main(String[] args){
        int f = 1;
        int s = 0;
        int sum = 0;

        while(f < 100){
            System.out.println(f);
            sum = f + s;
            s = f;
            f = sum;
        }
    }
}