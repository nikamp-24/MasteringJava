package Home.Java_basics;

import java.util.Arrays;

public class basic_64 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 67} ;
        System.out.println("Original Array: " + Arrays.toString(arr));


        System.out.print("Largest element between first, last, and middle values: ");
        int first = arr[0];
        int middle = arr[arr.length / 2];
        int last = arr[arr.length - 1];


        int max = first;
        if (middle > max) {
            max = middle;
        }
        if (last > max) {
            max = last;
        }

        System.out.println(max);

    }
}
