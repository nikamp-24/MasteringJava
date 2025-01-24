import java.util.Scanner;

import static java.lang.Math.*;

public class basic_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = sc.nextDouble();


        System.out.println("The distance between those points is: " + dis_bet_latLon(x1, y1, x2, y2) + "km");
    }

    public  static  double dis_bet_latLon(double x1, double y1, double x2, double y2){
        double radius = 6371.01 ;
        x1 = Math.toRadians(x1);y1 = Math.toRadians(y1);x2 = Math.toRadians(x2);y2 = Math.toRadians(y2);
        return radius * acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));
    }
}
