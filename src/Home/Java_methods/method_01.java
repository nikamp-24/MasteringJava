package Home.Java_methods;

import java.util.Scanner;

public class method_01 {
//Java method to find the smallest number among three numbers.

   public static int smallestNumber(int x, int y, int z){

      return Math.min(Math.min(x, y), z);

   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = sc.nextInt();

        System.out.print("Input the first number: ");
        int y = sc.nextInt();

        System.out.print("Input the first number: ");
        int z = sc.nextInt();

        System.out.println("Smallest value is: "+smallestNumber(x, y, z));


    }


}
