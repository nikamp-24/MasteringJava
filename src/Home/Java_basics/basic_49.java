package Home.Java_basics;

import java.util.Scanner;

public class basic_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Result: " + result(num1, num2));


    }

    public static int result(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        }
        if (num1 % 6 == num2 % 6) {
            return (num1 < num2) ? num1 : num2;
        }
        return (num1 > num2) ? num1 : num2;
    }
}
