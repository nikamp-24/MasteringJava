package Home.Java_methods;

import java.util.Scanner;

public class method_05 {
    public static void main(String[] args) {

//    method to count all the words in a string.
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("The number of the words in the string are:" + wordsCount(str));
    }

    public static int wordsCount(String str) {
        int count = 0;
        String newStr = str.trim();
        if (newStr != " ") {
            for (int i = 0; i < newStr.length(); i++) {
                if (newStr.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count + 1;
    }
}
