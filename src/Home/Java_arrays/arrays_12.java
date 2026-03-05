package Home.Java_arrays;

import java.util.Arrays;

public class arrays_12 {
    public static void main(String[] args) {
//        Rotate array right by 1
        int arr[] = { 1, 2, 3 , 4, 5, 6};

        int last = arr[arr.length-1];

        for (int i = arr.length -1 ; i > 0 ; i--){
          arr[i] = arr[i-1];
        }

        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }
}
