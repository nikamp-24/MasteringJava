package Home.Java_arrays;

public class arrays_16 {
    public static void main(String[] args) {
//        Find missing number (1 to n)

        int arr[] = {2, 3, 4, 5, 6, 8};

        int f = arr[0];
        int n = arr[arr.length - 1];
//We subtract sum of numbers from 1 to (f−1) from sum of numbers from 1 to n,
// so only the numbers from f to n remain.
        int expectedSum = ((n * (n + 1)) / 2) - ((f * (f - 1)) / 2);

       int actualSum = 0;

       for (int i = 0; i< arr.length; i++){
           actualSum+= arr[i];
       }
       int missing = expectedSum - actualSum;
        System.out.println("Missing number = " + missing);
    }
}
