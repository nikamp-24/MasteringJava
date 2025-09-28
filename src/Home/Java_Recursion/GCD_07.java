package Home.Java_Recursion;

import java.util.Scanner;

public class GCD_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The GCD of " + a + " and "+b+" is: " + gcd(a , b));
    }

     static int gcd(int a, int b) {
        if (b==0)
            return a;

        return gcd(b, a%b);
    }
}
