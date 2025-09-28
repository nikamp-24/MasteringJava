package Home.Java_Recursion;

import java.util.Scanner;

public class FibonacciRecur_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci series upto " +n +"terms:");
       for (int i =0; i<n; i++){
           System.out.print(fib(i)+ " ");
       }

    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
}
