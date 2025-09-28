package Home.Java_arrays;

import java.util.Arrays;

public class arrays_02 {
    public static void main(String[] args) {

//    Sum of all array elements
        int[] arr = {2, 4, 5, 6, 2, 1};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
