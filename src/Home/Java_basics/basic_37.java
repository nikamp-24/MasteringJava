package Home.Java_basics;

import java.util.Scanner;

public class basic_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String num = sc.next();

        int result = Integer.parseInt(num);
        System.out.print("The integer value is: "+result);
    }
}
