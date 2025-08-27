package Home.Java_loops;

import java.util.Scanner;

public class Java_loops_01 {
    public static void main(String[] args) {
//        System.out.print("Enter the number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num==0){
//            System.out.println("Number is zero");
//        } else if (num>0) {
//            System.out.println("Number is positive");
//        }else {
//            System.out.println("Number is negative");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter num2: ");
//        int num2 = sc.nextInt();
//        System.out.print("Enter operator (+, -, *, /): ");
//
//        char operator = sc.next().charAt(0);
//
//        switch (operator){
//            case '+':
//                System.out.println("The addition is :" + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("The subtraction is :" + (num1 - num2));
//             break;
//            case '*':
//                System.out.println("The multiplication is :" + (num1*num2));
//                break;
//            case '/':
//                if (num2 != 0)
//                    System.out.println("The division is: " + (num1 / num2));
//                else
//                    System.out.println("Error: Cannot divide by zero");
//                break;
//            default:
//                System.out.println("Invalid operator entered");
//        }


        System.out.print("Input the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if( (year%4 ==0 && year%100 != 0 ) ||  (year % 400 == 0)){
            System.out.println("Its the leap year ");
        }else {
            System.out.println("Tts not the leap year");
        }
    }
}
