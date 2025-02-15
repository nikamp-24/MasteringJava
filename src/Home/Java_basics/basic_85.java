package Home.Java_basics;

import java.util.Arrays;

public class basic_85 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 56, 10, 45, 67, 56, 46};

        int result = 0;

        System.out.println("Original Array: " + Arrays.toString(arr));

        int l = 0;
        int[] new_arr;


        while (arr[l] != 10)
            l++;
            new_arr = new int[l];
            for (int i = 0; i < l; i++) {
                new_arr[i] = arr[i];

            }
        System.out.println("New Array: " + Arrays.toString(new_arr));
        }
    }

