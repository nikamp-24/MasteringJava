package Home.Java_basics;

import java.util.Scanner;

public class basic_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first integer: " );
        int num1  = sc.nextInt();
        System.out.print("Input Second integer: " );
        int num2 =  sc.nextInt();

        if (num1 == num2)
            System.out.printf("%d == %d\n", num1, num2);
        if (num1 != num2)
            System.out.println(num1 + " != " + num2);
        if (num1 > num2)
            System.out.printf("%d > %d\n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d\n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d >= %d\n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d <= %d\n", num1, num2);

    }
}
