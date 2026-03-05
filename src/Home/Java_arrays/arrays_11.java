package Home.Java_arrays;

import java.util.Arrays;

public class arrays_11 {
    public static void main(String[] args) {
//        Rotate array left by 1
        int arr[] = {1, 2, 4, 5, 5, 6};

        int first = arr[0];

        for (int i = 0; i< arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = first;
        System.out.println(Arrays.toString(arr));
    }
}
