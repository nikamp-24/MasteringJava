package Home.Java_conditional_statements;

import java.util.Scanner;

public class ConditionalStatements06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        float num1 = sc.nextFloat();
        System.out.print("Input another floating-point number: ");
        float num2 = sc.nextFloat();

        num1 = num1 * 1000;
        num1 = Math.round(num1);
        num1 = num1 / 1000;


        num2 = Math.round(num2 * 1000);
        num2 = num2 / 1000;

        if (num1 == num2) {
            System.out.println("They are same up to three decimal places.");
        } else {
            System.out.println("They are different");
        }
    }
}
