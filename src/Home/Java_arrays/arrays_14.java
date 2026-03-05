package Home.Java_arrays;

import java.util.Arrays;

public class arrays_14 {
    public static void main(String[] args) {
        //        Rotate array by K positions  ==> to the left
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        k = k % n;

        for (int r = 0; r < k; r++) {
            int first = arr[0];

            for (int i = 0; i < n-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
