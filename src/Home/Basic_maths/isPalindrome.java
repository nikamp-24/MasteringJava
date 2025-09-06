package Home.Basic_maths;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int duplicate = num;
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num /= 10;
        }

        if (reverseNum == duplicate) System.out.print("The give number is palindrome");
         else System.out.print("The given number is not palindrome.");
        sc.close();
    }
}
