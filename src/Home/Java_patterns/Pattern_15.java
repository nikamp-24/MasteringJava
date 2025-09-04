package Home.Java_patterns;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = sc.nextInt();

       for (int i = 0; i<n; i++){

           for (char j = 'A'; j<='A'+(n-i-1); j++){
               System.out.print(j);
           }
           System.out.println();
       }
       sc.close();
    }
}
