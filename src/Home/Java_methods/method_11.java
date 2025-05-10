package Home.Java_methods;

import java.util.Scanner;

public class method_11 {
    public static void main(String[] args) {
        System.out.println("""
                1. A password must have at least eight characters.

                2. A password consists of only letters and digits.

                3. A password must contain at least two digits""");

        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid.");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
