import java.util.Scanner;

public class basic_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        for (int i =1; i<=10; i++){
            int mul = i * num;
            System.out.println(num + " x " + i +" = "+mul);
        }
    }
}
