package Home.Java_basics;

import java.util.Scanner;

public class basic_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = sc.nextInt();

        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors++;
        }
        System.out.println(factors);
    }
}
