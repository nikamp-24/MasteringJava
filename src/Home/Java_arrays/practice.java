package Home.Java_arrays;

public class practice {
    public static void main(String[] args) {
//        int num = 24;
        int lowerRange = 2;
        int upperRange = 20;

       for (int i = lowerRange; i<= upperRange;i++){
           if (isPrime(i)){
               System.out.print(i+" ");
           }

       }

    }

    public static boolean isPrime(int num) {

        if (num<= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
              return false;
            }
        }
        return true;
    }
}
