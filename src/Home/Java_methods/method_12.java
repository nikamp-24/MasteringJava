package Home.Java_methods;

import java.util.Random;
import java.util.Scanner;

public class method_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        nBynMatrix(n);

    }

    public static void nBynMatrix(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
          for (int j = 0; j <n ; j++){
              int value = random.nextInt(2);
              System.out.print(value);
          }
            System.out.println();
            
        }
    }
}
