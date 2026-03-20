package Home.Java_methods;

import java.util.Scanner;

public class method_25 {

        static void printFibonacci(int n) {

            if (n <= 0) return;

            int a = 0, b = 1;

            System.out.print(a);

            if (n == 1) return;


            System.out.print(" " + b);


            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(" " + c);

                a = b;
                b = c;
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            printFibonacci(n);

            sc.close();
        }
    }
