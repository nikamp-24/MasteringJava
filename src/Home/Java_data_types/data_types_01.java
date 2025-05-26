package Home.Java_data_types;

import java.util.Scanner;

public class data_types_01 {
    public static void main(String[] args) {
    //convert temperature from Fahrenheit to Celsius degrees.

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();

        double celsius = (Fahrenheit - 32) * 5 / 9;

        System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }
}
