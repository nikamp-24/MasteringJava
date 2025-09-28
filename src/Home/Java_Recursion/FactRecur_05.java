package Home.Java_Recursion;

import java.util.Scanner;

public class FactRecur_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print( fact(n));
    }

    private static int fact(int n) {
        if (n==0)return 1;
        return n* fact(n-1);
    }
}
