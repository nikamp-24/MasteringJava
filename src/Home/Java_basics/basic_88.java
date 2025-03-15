package Home.Java_basics;

import java.util.Arrays;

public class basic_88 {
    public static boolean threeAdjInc(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 9};
        System.out.println("Original Array:" + Arrays.toString(arr));

        System.out.println(threeAdjInc(arr));
    }
}
