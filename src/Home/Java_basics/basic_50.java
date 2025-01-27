package Home.Java_basics;

import java.util.Scanner;

public class basic_50 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the dividend: ");
                int dividend = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();

                if (divisor == 0) {
                    System.out.println("Divisor cannot be zero.");
                    return;
                }

                int modulus = calculateModulus(dividend, divisor);

                System.out.println("The modulus of " + dividend + " and " + divisor + " is: " + modulus);
            }

            public static int calculateModulus(int dividend, int divisor) {
                int quotient = dividend / divisor;
                int product = quotient * divisor;
                return dividend - product;
            }
        }

