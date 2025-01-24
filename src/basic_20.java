import java.util.Scanner;

public class basic_20 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = sc.nextDouble();
        System.out.println("The area of the hexagon is: " + (6 * (s * s)) / (4 * Math.tan(Math.PI / 6)));
    }
}
