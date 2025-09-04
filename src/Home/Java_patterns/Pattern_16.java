package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            char ch = (char)('A'+i);
            for (int j = 0; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
