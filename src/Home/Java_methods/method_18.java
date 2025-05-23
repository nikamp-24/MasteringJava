package Home.Java_methods;

import java.util.Scanner;

public class method_18 {
    public static void main(String[] args) {

//        Three integers and check whether they are consecutive
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number:  ");
        int p = sc.nextInt();
        System.out.print("Input the second number:  ");
        int q = sc.nextInt();
        System.out.print("Input the third number:  ");
        int r = sc.nextInt();

        boolean result = isConsecutive(p, q, r);
        System.out.println(result);
    }

    public static boolean isConsecutive(int p, int q, int r) {
        int max = Math.max(p, Math.max(q, r));
        int min = Math.min(p, Math.min(q, r));
        int mid = p + q + r - max - min;
        return (max - mid) == 1 && (mid - min) == 1;
    }
}
