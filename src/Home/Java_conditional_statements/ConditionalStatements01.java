package Home.Java_conditional_statements;

import java.util.Scanner;

public class ConditionalStatements01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        if (num>=0){
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }
    }
}
