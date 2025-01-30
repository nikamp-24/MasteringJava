package Home.Java_basics;

public class basic_71 {
    public static void main(String[] args) {
//   Sample program:
        System.out.print("First 10 natural numbers are: ");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

//        measure the required time to execute this code in nanoseconds

        long initialTime = System.nanoTime();
        long finalTime = System.nanoTime() - initialTime;
        System.out.println("\nRequired time to get the first 10 natural numbers: "+ finalTime + " ns" );
    }
}
