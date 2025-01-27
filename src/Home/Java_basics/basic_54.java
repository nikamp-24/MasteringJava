package Home.Java_basics;

import java.util.Scanner;

public class basic_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.nextLine();

        String sub_str = string.substring(0, string.length() / 2);
        System.out.println(sub_str);

    }
}
