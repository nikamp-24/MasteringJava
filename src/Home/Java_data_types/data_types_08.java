package Home.Java_data_types;

import java.util.Scanner;

public class data_types_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int num1 = sc.nextInt();

        System.out.print("Input 2st integer:");
        int num2 = sc.nextInt();

        System.out.printf("Sum of two integers: %d%n", num1 + num2);
        System.out.printf("Difference of two integers: %d%n", num1 - num2);
        System.out.printf("Product of two integers: %d%n", num1 * num2);
        System.out.printf("Average of two integers: %.2f%n", (double) (num1 + num2 )/ 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(num1-num2));
        System.out.printf("Max integer: %d%n", Math.max(num1, num2));
        System.out.printf("Min integer: %d%n", Math.min(num1, num2));

    }
}
