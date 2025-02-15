package Home.Java_basics;

import java.util.Arrays;

public class basic_74 {

    public static int[] lastTenDigits(int[] arr) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 10) {
                lastIndex = i;
            }
        }
        if (lastIndex == -1 || lastIndex == arr.length - 1) {
            return new int[0]; // Empty array
        }

        return Arrays.copyOfRange(arr, lastIndex + 1 , arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 40, 50, 64, 10, 65, 86};
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] newArr = lastTenDigits(arr);

        System.out.println("New Array:" + Arrays.toString(newArr));

    }
}
