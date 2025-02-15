package Home.Java_basics;

import java.util.Arrays;

public class basic_86 {

    public static boolean isSameGroup(int[] arr, int l) {
        if (arr.length < l) return false;
        return Arrays.equals(Arrays.copyOfRange(arr, 0, l), Arrays.copyOfRange(arr, arr.length - l, arr.length));
    }


    public static void main(String[] args) {
//        check if a group of numbers (l) at the start and end of a given array are the same.


        int[] nums = {1, 2, 3, 4, 1, 2};
        int l = 2;

        System.out.println(isSameGroup(nums, l));



    }
}
