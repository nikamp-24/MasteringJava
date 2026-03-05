package Home.Java_arrays;

import java.util.Arrays;

public class arrays_09 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 3, 4, 2, 5};
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                  visited[j] = true;
                }
            }
            System.out.println(arr[i] + " ");
        }

    }
}
