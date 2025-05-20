package Home.Java_methods;

import java.util.Scanner;

public class method_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Side-1: ");
        int p = sc.nextInt();

        System.out.print("Input Side-2: ");
        int q = sc.nextInt();

        System.out.print("Input Side-3: ");
        int r = sc.nextInt();

        double area = calculateArea(p, q, r);
        System.out.println(area);

    }

    public static double calculateArea(int p , int q, int r){
        double sp = (p+q+r)/2.0;
        return Math.sqrt(sp * (sp - p)* (sp - q) * (sp -r));
    }
}
