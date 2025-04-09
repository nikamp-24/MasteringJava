package Home.Java_methods;

import java.util.Scanner;

public class method_03 {
    public static void main(String[] args) {

//        method to find the middle character of String
        System.out.print("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The middle character in the string: " + middle(str));

    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
