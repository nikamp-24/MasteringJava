package Home.Java_data_types;

import java.util.Scanner;

public class data_types_02 {
    public static void main(String[] args) {
//  reads a number in inches and converts it to meters.

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inches = sc.nextDouble();

        double meters = inches * 0.0254;
        System.out.println(inches + " inch is " + meters  + " meters");
    }
}
