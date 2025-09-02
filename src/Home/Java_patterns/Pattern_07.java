package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
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
    }
}
