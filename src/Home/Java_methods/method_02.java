package Home.Java_methods;

import java.util.Scanner;

public class method_02 {

//    method to compute the average of three numbers
    public static double avg(int x, int y, int z){
        return (x + y+ z) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = sc.nextInt();

        System.out.print("Input the first number: ");
        int y = sc.nextInt();

        System.out.print("Input the first number: ");
        int z = sc.nextInt();

        System.out.println("Average value is: "+avg(x, y, z));
    }
}
