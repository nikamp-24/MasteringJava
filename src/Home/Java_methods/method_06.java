package Home.Java_methods;

import java.util.Scanner;

public class method_06 {
    public static void main(String[] args) {
//        method to compute the sum of digits in an integer.
        System.out.print("Input an Integer:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of digits:"+sumDigits(num));

    }

    public static int sumDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10; // adds last digit to the sum
            num /= 10;   // result gives first elements that means last digit is removed
        }
        return sum;
    }
}
