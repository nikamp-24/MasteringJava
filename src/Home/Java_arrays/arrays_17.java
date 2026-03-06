package Home.Java_arrays;

import java.util.HashSet;

public class arrays_17 {
    public static void main(String[] args) {

//        Find intersection of two arrays
        int arr1[] = {1, 3, 4, 5, 6, 3, 4};
        int arr2[] = {1, 6, 3, 4, 9, 8};

        HashSet<Integer> set = new HashSet<>();

        for (int num: arr1){
            set.add(arr1[num]);
        }

        for (int j =0; j< arr2.length; j++){
            if (set.contains(arr2[j])){
                System.out.print(arr2[j]+" ");
                set.remove(arr2[j]);
            }
        }
    }
}
