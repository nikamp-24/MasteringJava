package Home.Java_patterns;

import java.util.Scanner;
import static java.lang.Math.min;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;


                int minDist = min(min(top, down), min(left, right));

                System.out.print(n - minDist + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
