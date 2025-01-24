package Home.Java_basics;

import java.util.Scanner;

public class basic_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char character = sc.next().charAt(0);

        int ASCII = (int) character;

        System.out.println("The ASCII value of Z is: "+ASCII);


    }
}
