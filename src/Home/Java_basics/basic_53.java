package Home.Java_basics;

import java.lang.*;
import java.util.Scanner;

public class basic_53 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string (minimum 3 characters): ");
                String originalString = scanner.nextLine();

                if (originalString.length() >= 3) {

                    String lastThree = originalString.substring(originalString.length() - 3);
                    String result = lastThree + lastThree + lastThree + lastThree;
                    System.out.println("Resulting String: " + result);
                } else {

                    System.out.println("The string length must be at least 3 characters.");
                }
        }

    }
        
