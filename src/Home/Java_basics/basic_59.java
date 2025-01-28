package Home.Java_basics;

import java.util.Arrays;

public class basic_59 {
    public static void main(String[] args) {
         int[] arr1 = { 50, -20, 0 };
         int[] arr2 = { 5, -50, 10 } ;

         int[] newArr = {arr1[0] , arr2[ arr2.length - 1 ]};
        System.out.println("New Array: " + Arrays.toString( newArr ));
    }
}
