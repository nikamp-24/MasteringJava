package Home.Java_methods;

import java.util.Scanner;

public class method_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = scanner.nextInt();
        System.out.println("Check whether every digit of the said integer is even or not!");
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n) {
        if (n == 0)return false;
        while (n != 0){
           int digit =  n % 10;
           if (digit % 2 !=0){
               return false;
           }
           n /= 10;
        }
        return true;
    }
}
