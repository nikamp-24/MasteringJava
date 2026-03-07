package Home.Java_arrays;

import java.util.Arrays;

public class arrays_21 {
    public static void main(String[] args) {
//        Merge two sorted arrays
        int arr1[] = {1, 2, 3, 4, 5,6, 7};
        int arr2[] = {4, 5, 6, 7, 8, 9};

        int sortedArr[] = new int[arr1.length+arr2.length];


        int i =0, j =0 , k = 0;

        while (i< arr1.length && j< arr2.length){

            if (arr1[i] < arr2[j]){
                sortedArr[k] = arr1[i];
                i++;
            }else {
                sortedArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i< arr1.length){
            sortedArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j< arr2.length){
            sortedArr[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(sortedArr));
    }
}
