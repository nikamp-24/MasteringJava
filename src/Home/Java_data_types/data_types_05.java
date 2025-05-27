package Home.Java_data_types;

import java.util.Scanner;

public class data_types_05 {
    public static void main(String[] args) {
//  Java program to compute the body mass index (BMI).

//        BMI: The BMI is defined as the body mass divided by the square of the body height,
//        and is universally expressed in units of kg/m2,resulting from mass in kilograms and height in metres.

        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double wt = sc.nextDouble();

        System.out.print("Input height in inches:");
        double ht = sc.nextDouble();

        double BMI = wt * 0.45359237 / (ht * 0.0254 * ht * 0.0254);
        System.out.println("Body Mass Index is " + BMI+"\n");



    }
}
