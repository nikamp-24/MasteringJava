package Home.Java_arrays;

public class arrays_22 {
    public static void main(String[] args) {
//        Find leaders in array
//        A leader is an element that is greater than all elements to its right.

        int []arr = {1, 2, 34, 4, 5, 6};

        int max = arr[arr.length-1];
        System.out.print("Leaders : " + max +" ");

        for (int i = arr.length-2; i >= 0; i--){
            if (arr[i] > max){
                max = arr[i];
                System.out.print(max+ " ");
            }
        }



    }
}
