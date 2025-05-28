package Home.Java_data_types;

import java.util.Scanner;

public class data_types_09 {
    public static void main(String[] args) {
// Java program to break an integer into a sequence of digits.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int num = sc.nextInt();

        int n1 = num / 100000 % 10;
        int n2 = num / 10000 % 10;
        int n3 = num / 1000 % 10;
        int n4 = num / 100 % 10;
        int n5 = num / 10 % 10;
        int n6 = num % 10;

        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);


    }
}
