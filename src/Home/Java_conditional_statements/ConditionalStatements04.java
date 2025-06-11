package Home.Java_conditional_statements;

import java.util.Scanner;

public class ConditionalStatements04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num = sc.nextFloat();

        if (num == 0) {
            System.out.println(0);
        } else if (num > 0) {
            System.out.println("Positive number");
            if (num > 0 && num < 1) {
                System.out.println("small");
            }
            if (num > 1000000) {
                System.out.println("large");
            }
        } else {
            System.out.println("Negative number ");
        }

        sc.close();
    }
}
