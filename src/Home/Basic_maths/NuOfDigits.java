package Home.Basic_maths;

import java.util.Scanner;

public class NuOfDigits {
//    count the number of digits in the number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int ctr = 0;
        while (num>0){
            ctr ++;
            num/=10;
        }
        System.out.print("The number of digits in the number are: "+ctr);
        sc.close();
    }
}
