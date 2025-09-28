package Home.Java_arrays;

import java.util.Arrays;

public class arrays_01 {

    //    find and return the maximum value in a given integer array.

    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 3, 8, 2, 4};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
