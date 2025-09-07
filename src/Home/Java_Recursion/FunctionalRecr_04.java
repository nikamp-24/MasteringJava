package Home.Java_Recursion;

import java.util.Scanner;

public class FunctionalRecr_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print( printSum(n));
    }
    public static int printSum(int n){
        if (n==0)return 0;
        return n + printSum(n-1);
    }
}
