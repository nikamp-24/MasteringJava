package Home.Java_Recursion;

import java.util.Scanner;

public class ParameterisedRecr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printSum(n, 0);
    }

     static void printSum(int n, int Sum) {
        if (n<1){
            System.out.print("Sum is: "+Sum);
            return;
        }
        printSum(n-1, Sum+n);
    }

}
