package Home.Java_basics;

public class basic_51 {
    public static void main(String[] args) {

        int count = 0;
        int num = 2;

        System.out.println("First 100 Prime Numbers:");
        while (count < 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

