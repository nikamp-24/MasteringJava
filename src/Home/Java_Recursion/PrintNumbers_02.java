
package Home.Java_Recursion;
import java.util.Scanner;

public class PrintNumbers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("\n1 to n (Normal Recursion):");
        print1ToN_Normal(1, n);

        System.out.println("\n\n1 to n (Backtracking):");
        print1ToN_Backtrack(n, n);

        System.out.println("\n\nn to 1 (Normal Recursion):");
        printNTo1_Normal(n, n);

        System.out.println("\n\nn to 1 (Backtracking):");
        printNTo1_Backtrack(1, n);
    }

    // 1 to n normal
    static void print1ToN_Normal(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        print1ToN_Normal(i + 1, n);
    }

    // 1 to n backtrack
    static void print1ToN_Backtrack(int i, int n) {
        if (i < 1) return;
        print1ToN_Backtrack(i - 1, n);
        System.out.print(i + " ");
    }

    // n to 1 normal
    static void printNTo1_Normal(int i, int n) {
        if (i < 1) return;
        System.out.print(i + " ");
        printNTo1_Normal(i - 1, n);
    }

    // n to 1 backtrack
    static void printNTo1_Backtrack(int i, int n) {
        if (i > n) return;
        printNTo1_Backtrack(i + 1, n);
        System.out.print(i + " ");
    }
}
