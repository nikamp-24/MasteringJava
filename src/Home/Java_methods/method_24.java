package Home.Java_methods;


import java.util.Scanner;

public class method_24 {
    static void XylemPhloem(int num) {
num = Math.abs(num);
        int lastDigit = num % 10;
        int firstDigit = 0;
        int meanSum = 0;

        num = num / 10;

        while (num > 9) {
            meanSum += num % 10;
            num = num / 10;
        }

        firstDigit = num;
        int extremeSum = firstDigit + lastDigit;
        if (meanSum == extremeSum) {
            System.out.println("Xylem");
        }else {
            System.out.println("Phloem");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       XylemPhloem(num);
       sc.close();
    }
}
