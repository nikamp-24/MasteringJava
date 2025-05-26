package Home.Java_data_types;

import java.util.Scanner;

public class data_types_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        int minutes = scanner.nextInt();

        int minutesInYear = 365 * 24 * 60;

        int years = minutes / minutesInYear;

        int remainingMinutes = minutes % minutesInYear;

        int days = remainingMinutes / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
