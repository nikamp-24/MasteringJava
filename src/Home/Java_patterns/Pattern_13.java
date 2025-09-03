package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int num = 1;
        for (int i = 1; i<=n; i++){

            for (int j=1; j<=i; j++){
                System.out.print(num +" ");
                num+=1;
            }
            System.out.println();
        }
        sc.close();
    }
}
