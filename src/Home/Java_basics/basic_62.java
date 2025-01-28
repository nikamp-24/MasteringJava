package Home.Java_basics;

import java.util.Arrays;

public class basic_62 {
    public static void main(String[] args) {
// get the largest value between the first and last elements of an array (length 3) of integers


                int[] arr = {20, 30, 40};

                System.out.println("Original Array: " + Arrays.toString(arr));

                int max_val = arr[0];

                if (arr[2] >= max_val)
                    max_val = arr[2];

                System.out.println("Larger value between first and last element: " + max_val);

    }
}
