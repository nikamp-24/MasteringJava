package Home.Java_methods;

import java.util.Scanner;

public class method_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number:  ");
        int p = sc.nextInt();
        System.out.print("Input the second number:  ");
        int q = sc.nextInt();
        System.out.print("Input the third number:  ");
        int r = sc.nextInt();
        boolean result = isMidpoint(p, q, r);
        System.out.println(result);

    }
    public static boolean isMidpoint(int p, int q, int r){
        int min = Math.min(p, Math.min(q, r));
        int max = Math.max(p, Math.max(q, r));
        int middle = p + q + r - max - min;
        double mid = (min + max) / 2.0;
        return  mid == middle ;
    }
}
