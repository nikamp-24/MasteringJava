package Home.Java_data_types;

import java.util.Scanner;

public class data_types_07 {
    public static void main(String[] args) {
//        Java program that reads a number and displays the square, cube, and fourth power.

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double num = sc.nextFloat();

        System.out.printf("Square: %12.2f\n", num * num);

        System.out.printf("Cube: %15.2f\n", num * num * num);

        System.out.printf("Fourth power: %6.2f\n", Math.pow(num, 4));

    }
}
