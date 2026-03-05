package Home.Basic_maths;

import java.util.Scanner;

public class GCD_LCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd=1;
        int greater = Math.max(num1, num2);
        for (int i = 1; i<= greater; i++){
            if (num1%i==0 && num2%i==0){
                 gcd = i;
            }
        }
        int lcm = (num1 * num2) / gcd;
        System.out.print("The greatest common divisor is: "+gcd);
        System.out.print("The least common multiplier is: "+lcm);
        sc.close();
    }
}
