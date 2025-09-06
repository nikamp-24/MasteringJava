package Home.Basic_maths;

import java.util.Scanner;

public class isArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int duplicate = num;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num/=10;
        }
        if (sum == duplicate) System.out.print("The given number is armstrong number");
        else System.out.print("The given number is not armstrong number");
        sc.close();
    }
}
