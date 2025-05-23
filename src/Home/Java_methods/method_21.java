package Home.Java_methods;

import java.util.Scanner;

public class method_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer(positive/negative): ");
        int n = sc.nextInt();
        System.out.print("Factors of 3 of the said integer: ");
        test(n);
    }

    public static void test(int n) {
        n = Math.abs(n);
        while (n % 3 == 0 && n != 0) {
            System.out.print("3 * ");
            n /= 3;
        }
        System.out.println(n);
    }
}
