package Home.Basic_maths;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        // handle edge cases
        if (num <= 1){
            isPrime = false;
    }else{
            for (int i = 2; i<=Math.sqrt(num); i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if (isPrime)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is NOT a Prime number");
        sc.close();

    }
}
