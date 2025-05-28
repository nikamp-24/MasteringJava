package Home.Java_data_types;

import java.util.Scanner;

public class data_types_10 {
    public static void main(String[] args) {
//Java program to test whether a given double/float value is a finite floating-point value or not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        if (number == Double.POSITIVE_INFINITY || number == Double.NEGATIVE_INFINITY || Double.isNaN(number)){
            System.out.println("The number is not finite number ");
        }else {
            System.out.println("The number is a finite value");
        }
        scanner.close();
    }
}
