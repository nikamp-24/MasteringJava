package Home.Java_basics;

import java.util.Scanner;

public class basic_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number : ");
        int num3 = sc.nextInt();


        if (num2 > num1 && num3 > num2){
            System.out.println("true");
        }
    }
}
