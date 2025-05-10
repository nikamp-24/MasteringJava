package Home.Java_methods;

import java.util.Scanner;

public class method_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Input the rate of interest: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Input number of years: ");
        int years = sc.nextInt();

        System.out.println("Years    FutureValue");

        for (int i = 1; i <= years; i++) {
            double futureValue = getFutureInvest(investmentAmount, annualInterestRate, i);
            System.out.printf("%-8d%.2f\n", i, futureValue);
        }

        sc.close();
    }

    public static double getFutureInvest(double investmentAmount, double annualInterestRate, int years) {
        return investmentAmount * Math.pow(1 + annualInterestRate / (12 * 100), years * 12);
    }
}
