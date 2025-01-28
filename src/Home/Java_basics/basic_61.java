package Home.Java_basics;

import java.util.Arrays;

public class basic_61 {
    public static void main(String[] args) {

//        rotate an array of length 3 to right by 1

        int[] arr = { 20, 30, 40} ;
        System.out.println("Original Array: " +Arrays.toString(arr));
        int[] nArr = { arr[1] , arr[2] , arr[0]} ;
        System.out.println("Rotated Array: " + Arrays.toString(nArr));
    }
}
