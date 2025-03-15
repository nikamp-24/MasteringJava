package Java;

import java.util.Arrays;
import java.util.Collections;

public class CollectionFramework_07 {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of the element 4 in the array is: "+index);

        Arrays.sort(numbers);
      for (int i : numbers){
          System.out.print(i+ " ");
      }

//      if the elements are greater than 8192 parallel sort

        Arrays.fill(numbers, 12);


    }
}
