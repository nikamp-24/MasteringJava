package Home.Basic_maths;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverseNum= 0;
        while (num >0){
            int lastDigit = num%10;
             reverseNum = reverseNum *10 + lastDigit;
             num/=10;
        }
        System.out.print("The reverse number is: "+reverseNum);
        sc.close();
    }
}
