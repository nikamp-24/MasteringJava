package Home.Java_methods;

import java.util.Scanner;

public class method_04 {
    public static void main(String[] args) {

//        method to count all vowels in a string.
        System.out.print("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The number of vovels in the string: " + count_vovels(str));
    }

    public static int count_vovels(String str) {
        int count = 0;
        String lowercase = str.toLowerCase();
        for (int i = 0; i <= lowercase.length() - 1; i++) {
            if (lowercase.charAt(i) == 'a' || lowercase.charAt(i) == 'e' || lowercase.charAt(i) == 'i' ||
                    lowercase.charAt(i) == 'o' || lowercase.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
