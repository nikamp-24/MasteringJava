package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        System.out.print("Enter the row numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 1;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) start = 1;
//            else start = 0;
//            for (int j = 0;j<=i; j++){
//                System.out.print(start);
//                start=1-start;
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j-1) % 2);
            }
            System.out.println();
        }
        scanner.close();
    }
}
