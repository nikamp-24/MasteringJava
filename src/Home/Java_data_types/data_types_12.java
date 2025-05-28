package Home.Java_data_types;

import java.util.Scanner;

public class data_types_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = scanner.nextInt();

        int floorDiv = Math.floorDiv(dividend, divisor);
        int floorMod = Math.floorMod(dividend, divisor);

        System.out.println("Floor Division of " + dividend + " / " + divisor + " = " + floorDiv);
        System.out.println("Floor Modulus of " + dividend + " / " + divisor + " = " + floorMod);
     }
}
