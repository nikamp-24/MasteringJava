package Home.Java_basics;

import java.util.Scanner;

public class basic_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number : ");
        int num3 = sc.nextInt();

        int firstnum = num1 % 10;
        int secondhum = num2 % 10;
        int thirdnum = num3 % 10;


        boolean result = (firstnum == secondhum) || (secondhum == thirdnum) || (firstnum == thirdnum);

        System.out.println("The result is: "+result);
    }
}
