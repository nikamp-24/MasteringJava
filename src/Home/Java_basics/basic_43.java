package Home.Java_basics;

import java.util.Scanner;

public class basic_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");

        String input = sc.nextLine();

        String lowerCaseString = input.toLowerCase();

        System.out.print(lowerCaseString);
    }
}
