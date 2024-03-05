// Question 2: Fibonacci Sequence
// Write a program to generate the Fibonacci sequence up to 100.

public class FibonacciSequence {
    public static void main(String[] args){
        int size = 100;
        long f = 1;
        long s = 0;

        for(int i = 0; i < size; i++){
            long sum = f + s;
            s = f;
            f = sum;
            System.out.println(s);
        }
    }
}