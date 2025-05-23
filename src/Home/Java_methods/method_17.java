package Home.Java_methods;

import java.util.Scanner;

public class method_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        isTwoPresent(n);

    }

    public static void isTwoPresent(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int digits = temp % 10;
            if (digits == 2) {
                count++;
            }
            temp /= 10;
        }
        System.out.println(count);
    }
}
