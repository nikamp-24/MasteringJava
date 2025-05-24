package Home.Java_methods;

import java.util.Scanner;

public class method_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        System.out.println("Check all the characters of the said string are vowels or not!");
        System.out.println(areAllVowels(input));
    }

    public static boolean areAllVowels(String input) {
        input = input.toLowerCase(); // Case-insensitive check
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ("aeiou".indexOf(ch) == -1) {
                return false; // If character is not a vowel
            }
        }
        return true; // All characters are vowels
    }
}
