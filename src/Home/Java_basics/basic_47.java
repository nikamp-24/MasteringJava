package Home.Java_basics;

import java.util.Scanner;

public class basic_47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a word: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        StringBuilder reverse = sb.reverse();
        System.out.print("Reverse word: " + reverse);

    }
}
