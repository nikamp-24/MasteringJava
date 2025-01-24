package Home.Java_basics;

import java.util.Scanner;

public class basic_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num =  sc.nextInt();

        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of the digits is: "+sum);

    }
}
