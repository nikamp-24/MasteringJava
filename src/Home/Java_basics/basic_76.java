package Home.Java_basics;

import java.sql.Array;
import java.util.Arrays;

public class basic_76 {
    public static void main(String[] args) {
        int n = 5 ;
        String [] arr = new String[n];

        for (int i = 0 ; i < n; i++){
            arr[i] = String.valueOf(i);
        }

        System.out.println("New Array: " + Arrays.toString(arr));
    }
}
