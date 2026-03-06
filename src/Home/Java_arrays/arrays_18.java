package Home.Java_arrays;

import java.util.HashSet;

public class arrays_18 {
    public static void main(String[] args) {

//        Find union of two arrays
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = { 4, 5, 6 };

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1){
            set.add(num);
        }

        for (int num : arr2){
            set.add(num);
        }

        System.out.print(set);
    }
}
