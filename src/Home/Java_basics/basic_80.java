package Home.Java_basics;

import java.util.Arrays;

public class basic_80 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        System.out.println("Array 1:" + Arrays.toString(arr1));
        System.out.println("Array 2:" + Arrays.toString(arr2));

        int ctr = 0;

        for (int i = 0 ; i < arr1.length; i++){
            if (arr1[i] - arr2[i] <= 1 && arr1[i] != arr2[i]){
                ctr++;
            }
        }

        System.out.printf("Number of elements: "+ctr);
        System.out.printf("\n");
    }
}
