package Home.Java_basics;

import java.util.Arrays;

public class basic_87 {

    public static int[] leftShift(int[] arr) {
        int first = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] shiftedArray = leftShift(arr);
        System.out.println("Left Shifted Array: " + Arrays.toString(shiftedArray));
    }
}
