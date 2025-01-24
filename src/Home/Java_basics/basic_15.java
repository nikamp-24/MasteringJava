package Home.Java_basics;

import java.util.Scanner;

public class basic_15 {
    public static void main(String[] args) {

//
//                Scanner scanner = new Scanner(System.in);
//
//                // Input decimal number
//                System.out.print("Input a Decimal Number: ");
//                int decimal = scanner.nextInt();

//                // Convert decimal to binary using Integer.toBinaryString
//                String hexadecimal = Integer.toHexString(decimal);
//
//                // Output the binary representation
//                System.out.println("Hexadecimal number is: " + hexadecimal);
//

//        String octal = Integer.toOctalString(decimal);
//        System.out.println("Octal number is: " + octal);



///***************** Binary to...............

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input a Binary Number: ");
//        String binary = scanner.nextLine();

//        int decimal = Integer.parseInt(binary, 2);
//        System.out.println("Decimal Number: " + decimal);

//        String octal = Integer.toOctalString(decimal);
//        System.out.println("Octal Number: " + octal);

//        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
//        System.out.println("Hexadecimal Number: " + hexadecimal);

///******************Hexadecimal to................


        Scanner scanner = new Scanner(System.in);

        // Input Hexadecimal number
        System.out.print("Input a Hexadecimal Number: ");
        String Hexadecimal = scanner.nextLine();

        int decimal = Integer.parseInt(Hexadecimal, 16);
//        System.out.println("Decimal Number: "+decimal);

//        String binary = Integer.toBinaryString( decimal);
//        System.out.println("Binary Number: "+binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal Number: "+octal);















    }
}
