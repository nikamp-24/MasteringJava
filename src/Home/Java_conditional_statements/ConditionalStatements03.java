package Home.Java_conditional_statements;

import java.util.Scanner;

public class ConditionalStatements03 {
    public static void main(String[] args) {
//         take three numbers from the user and prints the greatest number.
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        double a = sc.nextDouble();
        System.out.print("Input the 2nd number: ");
        double b = sc.nextDouble();
        System.out.print("Input the 3rd number: ");
        double c = sc.nextDouble();

        double max = a;
        
        if (b > a){
            max= b;
            if (c > b){
                max = c;
            }
        } else if (c> a) {
            max = c;
            if (b > c){
                max = b;
            }
        }else {
            max = a;
        }

        System.out.println("The greatest: "+max);
    }
}
