package Home.Java_basics;

import java.util.*;

public class basic_69 {
            public static String digitToWord(int digit) {
                String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
                return words[digit];
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();


                int sum = 0;
                int temp = Math.abs(num);

                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                System.out.println("Sum of digits: " + sum);

                String sumString = Integer.toString(sum);
                System.out.print("Digits in English: ");
                for (int i = 0; i < sumString.length(); i++) {
                    System.out.print(digitToWord(sumString.charAt(i) - '0'));
                    if (i < sumString.length() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();

                scanner.close();
            }
}

