package Home.Java_conditional_statements;

import java.util.Scanner;

public class ConditionalStatements02 {
    public static void main(String[] args) {
        // Program to solve quadratic equations (use if, else if and else).
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }

        sc.close();
    }
}
