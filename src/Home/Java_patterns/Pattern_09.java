package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i<n ; i++){
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for (int s = 0; s<2*i+1; s++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
