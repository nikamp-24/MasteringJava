package Home.Java_basics;

import java.util.Scanner;

public class basic_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, second);

    }
}
