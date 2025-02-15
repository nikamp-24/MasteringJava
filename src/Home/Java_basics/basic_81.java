package Home.Java_basics;

import java.util.Arrays;

public class basic_81 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 10, 5, 30};

        boolean result = false;
        System.out.println("Original Array: "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] == 10 || arr[i] == 30){
               result = true;
            }
        }

        System.out.println(result);
    }
}
