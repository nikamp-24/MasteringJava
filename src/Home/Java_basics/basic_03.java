package Home.Java_basics;

import java.util.Scanner;

public class basic_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        int fistNumber = sc.nextInt();
        System.out.print("Input second number:");
        int secondNumber = sc.nextInt();

        int product = fistNumber*secondNumber;
        System.out.println(fistNumber+" x "+ secondNumber + " = "+product);

    }
}
