package Home.Java_basics;

import java.util.Arrays;

public class basic_75 {
        public static void rearrangeArray(int[] arr) {
            int[] temp = new int[arr.length];
            int index = 0;


            for (int num : arr) {
                if (num % 2 != 0) {
                    temp[index++] = num;
                }
            }


            for (int num : arr) {
                if (num % 2 == 0) {
                    temp[index++] = num;
                }
            }


            System.arraycopy(temp, 0, arr, 0, arr.length);
        }

        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 4, 5, 6, 7, 8};
            System.out.println("Original Array: " + Arrays.toString(arr));

            rearrangeArray(arr);

            System.out.println("Rearranged Array: " + Arrays.toString(arr));
        }
    }


