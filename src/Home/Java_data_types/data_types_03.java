package Home.Java_data_types;

import java.util.Scanner;

public class data_types_03 {
    public static void main(String[] args) {
        // Reads an integer between 0 and 1000 and adds all the digits in the integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = scanner.nextInt();
        int originalNum = num; // Save the original number for printing
        int sum = 0;
        if (num >= 1000){
            System.out.println("Please enter the number between 0 to 1000 and try again");
             return;
        }
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of all digits in " + originalNum + " is " + sum);
    }
}
