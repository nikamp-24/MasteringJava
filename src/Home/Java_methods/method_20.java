package Home.Java_methods;

import java.util.Scanner;

public class method_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer (positive/negative): ");
        int n = sc.nextInt();
        System.out.print("Extract the first digit from the said integer:\n");
        System.out.print(test(n));
    }

    public static int test(int n) {
        n = Math.abs(n);
        while (n > 10) {
            n /= 10;
        }
        return n;
    }
}
