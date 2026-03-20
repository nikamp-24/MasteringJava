package Home.Java_methods;

import java.util.Scanner;

public class method_26 {
    //    Check whether given number is armstrong number or not
    static void isArmStrong(int num) {
        num = Math.abs(num);
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int sum = 0;
        int temp1 = num;
//        for (int i = 1; i <= count; i++) {
//            int lastDigit = temp1 % 10;
//            sum += (int) Math.pow(lastDigit, count);
//            temp1 /= 10;
//        }

        while (temp1!=0){
            int lastDigit = temp1 % 10;
          int base = 1;
            for (int i = 1; i <= count; i++){
                 base *= lastDigit;
            }
            sum += base;
            temp1/=10;
        }

        if (sum == num) System.out.println("Armstrong number");
        else System.out.println("Not an armstrong number ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isArmStrong(num);
    }
}
