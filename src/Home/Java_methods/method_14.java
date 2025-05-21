package Home.Java_methods;

import java.util.Scanner;

public class method_14 {
//    Java method to create a pentagon's area.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the side:");
        double s = sc.nextDouble();
        System.out.print("Input the number of sides:");
        int  n = sc.nextInt();

        double area = createArea(s, n);
        System.out.println("The area of the pentagon is :"+area);

    }
    public static double createArea(double s , int n){
        return (n*s*s)/(4*Math.tan(Math.PI/n));
    }
}
