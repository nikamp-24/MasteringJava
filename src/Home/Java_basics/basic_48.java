package Home.Java_basics;

import java.util.Scanner;

public class basic_48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number : ");
        int num3 = sc.nextInt();


        boolean result = isTwentyOrMoreLess(num1, num2, num3);
        System.out.println("Result: " + result);

        sc.close();
    }


    public static boolean isTwentyOrMoreLess(int num1, int num2, int num3) {
        return num1 <= (num2 - num3 - 20) ||
                num2 <= (num1 - num3 - 20) ||
                num3 <= (num1 - num2 - 20);
    }
}
