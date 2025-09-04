package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i =0; i<n; i++){
         for (char ch =(char) ('E'- i); ch <=(char)'E'; ch++){
             System.out.print(ch+" ");
         }
            System.out.println();
        }
    }
}
