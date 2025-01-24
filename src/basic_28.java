import java.util.Scanner;

public class basic_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");

       String pass = sc.next();

        System.out.println("Your password was: " +pass);

        sc.close();
    }
}
