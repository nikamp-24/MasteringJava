import java.util.Scanner;

public class basic_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        double n = sc.nextDouble();
        System.out.print("Input the length of one of the sides: ");
        double s = sc.nextDouble();
        System.out.println("The area is: " + (( n* s*s)/(4* Math.tan(Math.PI/n))));
    }
}
