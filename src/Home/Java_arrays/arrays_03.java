package Home.Java_arrays;

public class arrays_03 {
//    Find the Index of a Specific Element
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 2, 1};
        int target = 6;
        int i = -1; // if the target do not found return -1
        for (i = 0; i <arr.length; i++){
            if (arr[i] == target){
                System.out.println(i);
            }
        }
    }
}
