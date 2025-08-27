package Home.Java_arrays;

import java.util.Arrays;

public class arrays_08 {
   
        public static void main(String[] args) {
            int[] arr = {1, 4, 6, 7, 1, 4, 8};

            int[] unique = Arrays.stream(arr)
                    .distinct()
                    .toArray();

            System.out.println("Array without duplicates: " + Arrays.toString(unique));
        }
    }

