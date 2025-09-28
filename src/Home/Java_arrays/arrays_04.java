package Home.Java_arrays;

import java.util.Arrays;

public class arrays_04 {

    // reverse an array without using another array

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp;
        int length = arr.length-1;
        for (int i = 0; i <arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[length-i];
            arr[length-i] = temp;

        }

        System.out.println("The reversed array is :" + Arrays.toString(arr));
    }
}
