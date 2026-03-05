package Home.Java_arrays;

import java.util.Arrays;

public class arrays_10 {
    //    Move all zeros to end
    public static void main(String[] args) {

        int arr[] = {1, 3, 0, 2, 0, 0, 4, 5, 5, 5};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
