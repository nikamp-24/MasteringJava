package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i + 1; j++) {
                System.out.print(ch);
                if (j<= breakPoint)ch++;
                else ch--;
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
