package Home.Java_Recursion;

import java.util.Scanner;

public class PrintName_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();
        printName(str, 1);
    }

    static void printName(String str, int count) {
        if (count > 5) {
            return;
        }
        System.out.print(str + " ");
        printName(str, count + 1);
    }
}
