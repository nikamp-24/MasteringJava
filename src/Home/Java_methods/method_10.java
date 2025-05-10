package Home.Java_methods;

import java.util.Scanner;

public class method_10 {
    public static void main(String[] args) {

//  check whether a year (integer) entered by the user is a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = sc.nextInt();

        boolean leapYear = isLeapYear(year);
        System.out.println(leapYear);

    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
