package Home.Java_arrays;

import java.util.Arrays;

public class arrays_13 {
    public static void main(String[] args) {
//        Rotate array by K positions  ==> to the right

        int arr[] = {1, 2, 3, 4, 5};
        int k = 1;
        int n = arr.length ;
         k =k % n;
        for (int r = 0; r< k; r++){

            int last = arr[n-1];

            for (int i = n-1; i>0; i--){
                      arr[i] = arr[i-1];
            }

            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
